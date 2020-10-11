package main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author amit
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String indexPage()
	{
		return "index";
	}
	
	@RequestMapping("/AirlineService")
	public String home()
	{
		return "home";
	}
}
