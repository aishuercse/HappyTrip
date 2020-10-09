package com.amit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="airline_detail")
public class AirlineDetail {

	@Id
	@Column(name="airline_id")
	private String airlineId;
	@Column(name="airline_name")
	private String airlineName;
	@OneToMany(mappedBy = "airlineDetail", cascade = CascadeType.ALL)
	private List<FlightDetail> listOfFlights;
	/**
	 * @return the airlineId
	 */
	public String getAirlineId() {
		return airlineId;
	}
	/**
	 * @param airlineId the airlineId to set
	 */
	public void setAirlineId(String airlineId) {
		this.airlineId = airlineId;
	}
	/**
	 * @return the airlineName
	 */
	public String getAirlineName() {
		return airlineName;
	}
	/**
	 * @param airlineName the airlineName to set
	 */
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	/**
	 * @return the listOfFlights
	 */
	public List<FlightDetail> getListOfFlights() {
		return listOfFlights;
	}
	/**
	 * @param listOfFlights the listOfFlights to set
	 */
	public void setListOfFlights(List<FlightDetail> listOfFlights) {
		this.listOfFlights = listOfFlights;
	}
}
