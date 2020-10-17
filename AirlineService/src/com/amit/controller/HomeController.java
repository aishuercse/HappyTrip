package com.amit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amit.model.UserDetail;

/**
 * @author amit
 */
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String loadApp()
	{
		return "index";
	}
	
	@RequestMapping("/AirlineService")
	public String home(Model model)
	{
		model.addAttribute("login", new UserDetail());
		return "home";
	}
	
	@RequestMapping("/login")
	public String login(@ModelAttribute UserDetail login, Model model)
	{
		System.out.println(login);
		System.out.println("user id: "+ login.getUserId());
		System.out.println("password: "+ login.getPassword());
		model.addAttribute("login", new UserDetail());
		return "home";
	}
}
