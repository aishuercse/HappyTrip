package com.amit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author amit
 * Entity class to maintain detail of travel class like- economy, business etc.
 * Travel class is specific to flight.
 */
@Entity
@Table(name="travel_class")
public class TravelClass {

	@Id
	@Column(name="class_type")
	private String classType;
	@Column(name="seats_available")
	private int seatsAvailable;
	@Column(name="price")
	private double price;
	@ManyToOne(optional = false)
    @JoinColumn(name = "flight_number")
	private FlightDetail flightDetail;
	/**
	 * @return the classType
	 */
	public String getClassType() {
		return classType;
	}
	/**
	 * @param classType the classType to set
	 */
	public void setClassType(String classType) {
		this.classType = classType;
	}
	/**
	 * @return the seatsAvailable
	 */
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	/**
	 * @param seatsAvailable the seatsAvailable to set
	 */
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the flightDetail
	 */
	public FlightDetail getFlightDetail() {
		return flightDetail;
	}
	/**
	 * @param flightDetail the flightDetail to set
	 */
	public void setFlightDetail(FlightDetail flightDetail) {
		this.flightDetail = flightDetail;
	}
	
}
