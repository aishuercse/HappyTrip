package com.amit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author amit
 * Entity class to maintain airport detail. Since we are only dealing with flight booking,
 * so location without airport is of no use for us. Hence clubbing location details also
 * inside airport table.
 */
@Entity
@Table(name="airport_detail")
public class AirportDetail {

	@Id
	@Column(name="airport_code")
	private String airportCode;
	@Column(name="airport_name")
	private String airportName;
	@Column(name="location_name")
	private String locationName;
	@Column(name="country_name")
	private String countryName;
	/**
	 * @return the airportCode
	 */
	public String getAirportCode() {
		return airportCode;
	}
	/**
	 * @param airportCode the airportCode to set
	 */
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	/**
	 * @return the airportName
	 */
	public String getAirportName() {
		return airportName;
	}
	/**
	 * @param airportName the airportName to set
	 */
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	/**
	 * @return the locationName
	 */
	public String getLocationName() {
		return locationName;
	}
	/**
	 * @param locationName the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}
