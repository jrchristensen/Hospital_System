package com.hosptialsystem.group7.Users;

public abstract class User {

	/**
	 * private String username - The username will also be the email that the
	 * user will recieve email notifications
	 */
	private String username;
	/**
	 * private string password - The password for the user
	 */
	// TODO The password need to be hashed.
	private String password;
	/**
	 * private string firstname - The first name of the user
	 */
	private String firstName;
	/**
	 * private string middleName - The middle name of the user
	 */
	private String middleName;
	/**
	 * private string lastName - The last name of the user
	 */
	private String lastName;
	/**
	 * private Date dateOfBirth - The date of birth of the user
	 */
	private Date dateOfBirth;
	/**
	 * private string maritalStatus - The marital status of the user
	 */
	private String maritialStatus;
	/**
	 * private MailingAddress userAddress - The address for the user
	 */
	private MailingAddress userAddress = new MailingAddress();
	/**
	 * private int primaryPhone - the primary phone number for the user
	 */
	private int primaryPhone;
	/**
	 * private int secondaryPhone - the secondary phone number for the user
	 */
	private int secondaryPhone;
	/**
	 * private String primaryEmail - The primary email address for the user. The
	 * default will be the username.
	 */
	private String primaryEmail;
	/**
	 * private String secondaryEmail - The secondary email address for the user.
	 */
	private String secondaryEmail;
	/**
	 * private String ecFirstName - The first name of the emergency contact
	 */
	private String ecFirstName;
	/**
	 * private String ecLastname - The last name of the emergenecy contact.
	 */
	private String ecLastName;
	/**
	 * private int ecPhoneNumber - The phone number of the emergenry contact.
	 */
	private int ecPhoneNuber;
	/**
	 * private String ecEmailAddress - The email address of the Emergency contact.
	 */
	private String ecEmailAddress;
	
	/**
	 * public constructor - will create a new instance of the class User and store the username, primary email and the password.
	 */
	public User(String applicantEmail, String applicantPassword){
		
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the maritialStatus
	 */
	public String getMaritialStatus() {
		return maritialStatus;
	}

	/**
	 * @param maritialStatus the maritialStatus to set
	 */
	public void setMaritialStatus(String maritialStatus) {
		this.maritialStatus = maritialStatus;
	}

	/**
	 * @return the userAddress
	 */
	public MailingAddress getUserAddress() {
		return userAddress;
	}

	/**
	 * @param userAddress the userAddress to set
	 */
	public void setUserAddress(MailingAddress userAddress) {
		this.userAddress = userAddress;
	}

	/**
	 * @return the primaryPhone
	 */
	public int getPrimaryPhone() {
		return primaryPhone;
	}

	/**
	 * @param primaryPhone the primaryPhone to set
	 */
	public void setPrimaryPhone(int primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	/**
	 * @return the secondaryPhone
	 */
	public int getSecondaryPhone() {
		return secondaryPhone;
	}

	/**
	 * @param secondaryPhone the secondaryPhone to set
	 */
	public void setSecondaryPhone(int secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}

	/**
	 * @return the primaryEmail
	 */
	public String getPrimaryEmail() {
		return primaryEmail;
	}

	/**
	 * @param primaryEmail the primaryEmail to set
	 */
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	/**
	 * @return the secondaryEmail
	 */
	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	/**
	 * @param secondaryEmail the secondaryEmail to set
	 */
	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	/**
	 * @return the ecFirstName
	 */
	public String getEcFirstName() {
		return ecFirstName;
	}

	/**
	 * @param ecFirstName the ecFirstName to set
	 */
	public void setEcFirstName(String ecFirstName) {
		this.ecFirstName = ecFirstName;
	}

	/**
	 * @return the ecLastName
	 */
	public String getEcLastName() {
		return ecLastName;
	}

	/**
	 * @param ecLastName the ecLastName to set
	 */
	public void setEcLastName(String ecLastName) {
		this.ecLastName = ecLastName;
	}

	/**
	 * @return the ecPhoneNuber
	 */
	public int getEcPhoneNuber() {
		return ecPhoneNuber;
	}

	/**
	 * @param ecPhoneNuber the ecPhoneNuber to set
	 */
	public void setEcPhoneNuber(int ecPhoneNuber) {
		this.ecPhoneNuber = ecPhoneNuber;
	}

	/**
	 * @return the ecEmailAddress
	 */
	public String getEcEmailAddress() {
		return ecEmailAddress;
	}

	/**
	 * @param ecEmailAddress the ecEmailAddress to set
	 */
	public void setEcEmailAddress(String ecEmailAddress) {
		this.ecEmailAddress = ecEmailAddress;
	}
}

