package com.amit.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author amit
 * Flight detail entity class.
 */
@Entity
@Table(name="flight_detail")
public class FlightDetail {

	@Column(name="flight_number")
	private String flightNumber;
	@Column(name="date_of_operation")
	private Date dateOfOperation;
	@OneToOne
	@JoinColumn(name="airport_code")
	private AirportDetail fromAirport;
	@OneToOne
	@JoinColumn(name="airport_code")
	private AirportDetail toAirport;
	@Column(name="departure_date")
	private Date departureDateAndTime;
	@Column(name="arrival_date")
	private Date arrivalDateAndTime;
	@OneToMany(mappedBy = "flightDetail", cascade = CascadeType.ALL)
	List<TravelClass> travelClassses;
	@ManyToOne(optional = false)
    @JoinColumn(name = "airline_id")
	private AirlineDetail airlineDetail;
	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}
	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	/**
	 * @return the dateOfOperation
	 */
	public Date getDateOfOperation() {
		return dateOfOperation;
	}
	/**
	 * @param dateOfOperation the dateOfOperation to set
	 */
	public void setDateOfOperation(Date dateOfOperation) {
		this.dateOfOperation = dateOfOperation;
	}
	/**
	 * @return the fromAirport
	 */
	public AirportDetail getFromAirport() {
		return fromAirport;
	}
	/**
	 * @param fromAirport the fromAirport to set
	 */
	public void setFromAirport(AirportDetail fromAirport) {
		this.fromAirport = fromAirport;
	}
	/**
	 * @return the toAirport
	 */
	public AirportDetail getToAirport() {
		return toAirport;
	}
	/**
	 * @param toAirport the toAirport to set
	 */
	public void setToAirport(AirportDetail toAirport) {
		this.toAirport = toAirport;
	}
	/**
	 * @return the departureDateAndTime
	 */
	public Date getDepartureDateAndTime() {
		return departureDateAndTime;
	}
	/**
	 * @param departureDateAndTime the departureDateAndTime to set
	 */
	public void setDepartureDateAndTime(Date departureDateAndTime) {
		this.departureDateAndTime = departureDateAndTime;
	}
	/**
	 * @return the arrivalDateAndTime
	 */
	public Date getArrivalDateAndTime() {
		return arrivalDateAndTime;
	}
	/**
	 * @param arrivalDateAndTime the arrivalDateAndTime to set
	 */
	public void setArrivalDateAndTime(Date arrivalDateAndTime) {
		this.arrivalDateAndTime = arrivalDateAndTime;
	}
	/**
	 * @return the travelClassses
	 */
	public List<TravelClass> getTravelClassses() {
		return travelClassses;
	}
	/**
	 * @param travelClassses the travelClassses to set
	 */
	public void setTravelClassses(List<TravelClass> travelClassses) {
		this.travelClassses = travelClassses;
	}
	/**
	 * @return the airlineDetail
	 */
	public AirlineDetail getAirlineDetail() {
		return airlineDetail;
	}
	/**
	 * @param airlineDetail the airlineDetail to set
	 */
	public void setAirlineDetail(AirlineDetail airlineDetail) {
		this.airlineDetail = airlineDetail;
	}
}
