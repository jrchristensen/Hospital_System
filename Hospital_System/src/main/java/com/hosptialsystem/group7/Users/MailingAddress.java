package com.hosptialsystem.group7.Users;

public class MailingAddress {

	/**
	 * private field street - will hold the street portion of the user address
	 */
	private String street;

	/**
	 * private field city - will hold the city portion of the user address
	 */
	private String city;
	/**
	 * private field state - will hold the state portion of the user address
	 */
	private String state;
	/**
	 * private field zipCode - will hold the zip code portion of the user
	 * address
	 */
	private int zipCode;

	/**
	 * public constructor - creates a blank address
	 */
	public MailingAddress() {
		setStreet("");
		setCity("");
		setZipCode(-1);
	}

	/**
	 * public constructor - will create an address with the following
	 * information:
	 * 
	 * @param street
	 *            The street address of the user
	 * @param city
	 *            The city the user lives in
	 * @param zipcode
	 *            The zip code of the user.
	 */
	public MailingAddress(String street, String city, String state, int zipcode) {
		setStreet(street);
		setCity(city);
		setState(state);
		setZipCode(zipcode);
	}

	/**
	 * public method getStreet - will return the street portion of the user
	 * address.
	 * 
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * public method setStreet - Sets the street portion of the user address.
	 * 
	 * @param street
	 *            the street portion of the use address to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * private method toString - will generate a string representation of the
	 * the date.
	 */
	@Override
	public String toString() {
		return getStreet() + "\n" + getCity() + ", " + getState() + " "
				+ getZipCode();
	}

	/**
	 * public method getCity - Will return the city portion of the user address.
	 * 
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * public method setCity - sets the city portion of the user address.
	 * 
	 * @param city
	 *            the city portion of the user address to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * private method get state - will return the state portion of the user
	 * address.
	 * 
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * private method setState - sets the state portion of the user address.
	 * 
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * public method getZipCode - Will return the zip code portion of the user
	 * address.
	 * 
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * public method setZipCode - Sets the zipcode portion of the user address.
	 * 
	 * @param zipCode
	 *            the zipCode portion of user address to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}
