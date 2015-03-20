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
	private Date dateOfBirth = new Date(1900, 0, 1);
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
}

