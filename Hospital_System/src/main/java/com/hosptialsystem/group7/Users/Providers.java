package com.hosptialsystem.group7.Users;

/**
 * @author Jacob
 *
 */
public class Providers extends User {

	/**
	 * private field jobTitle - stores the job title of the Provider
	 */
	private String jobTitle;

	/**
	 * private field degree - stores the degree of the Provider
	 */
	private String degree;

	/**
	 * private field specialization - stores the specialization of the Provider
	 */
	private String specalization;

	/**
	 * private field certification - stores the certification of the provider
	 */
	private String certification;

	/**
	 * private field experience - stores the experience level of the provider
	 */
	private String experience;

	/**
	 * private field department - stores the department information of the
	 * provider
	 */
	private String department;

	/**
	 * private field affiliation - stores the affiliation of the provider.
	 */
	private String affiliation;

	// TODO implement the Shift/Availability and Holidays

	/**
	 * public constructor - minimal constructor
	 * 
	 * @param applicantEmail
	 *            - the email address of the provider
	 * @param applicantPassword
	 *            - the projected email address of the provider
	 */
	public Providers(String applicantEmail, String applicantPassword) {
		super(applicantEmail, applicantPassword);

	}

	/**
	 * public constructor - maximal constructor
	 * 
	 * @param applicantEmail
	 *            - the email address of the provider
	 * @param applicantPassword
	 *            - the projected password of the provider
	 * @param jobTitle
	 *            - the job title of the provider
	 * @param degree
	 *            - the degree of the provider
	 * @param specailization
	 *            - the specialization of the provider.
	 * @param certificaion
	 *            - the certification of the provider.
	 * @param department
	 *            - the department of the provider.
	 * @param affiliation
	 *            - the affiliation of the provider
	 */
	public Providers(String applicantEmail, String applicantPassword,
			String jobTitle, String degree, String specailization,
			String certificaion, String department, String affiliation) {
		super(applicantEmail, applicantPassword);
		setJobTitle(jobTitle);
		setDegree(degree);
		setSpecalization(specailization);
		setCertification(certificaion);
		setDepartment(department);
		setAffiliation(affiliation);

	}

	/**
	 * public method getJobTitle - will return the job title of the provider
	 * 
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * public method setJobTitle - sets the job title of the provider
	 * 
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * public method setDegree - will return the degree of the provider
	 * 
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * public method setDegree - will set the degree of the provider
	 * 
	 * @param degree
	 *            the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}

	/**
	 * public method getSpecailization - will return the specialization of the
	 * provider
	 * 
	 * @return the specalization
	 */
	public String getSpecalization() {
		return specalization;
	}

	/**
	 * public method setSpecailization - will set the specialization of the
	 * provider
	 * 
	 * @param specalization
	 *            the specialization to set
	 */
	public void setSpecalization(String specalization) {
		this.specalization = specalization;
	}

	/**
	 * public method getCertification - will return the certification of the
	 * provider
	 * 
	 * @return the certification
	 */
	public String getCertification() {
		return certification;
	}

	/**
	 * public method setCertification - will set the certification of the
	 * provider
	 * 
	 * @param certification
	 *            the certification to set
	 */
	public void setCertification(String certification) {
		this.certification = certification;
	}

	/**
	 * public method getExperience - will return the experience of the provider
	 * @return the experience
	 */
	public String getExperience() {
		return experience;
	}

	/**
	 * public method setExperience - will set the experience of the provider
	 * @param experience
	 *            the experience to set
	 */
	public void setExperience(String experience) {
		this.experience = experience;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the affiliation
	 */
	public String getAffiliation() {
		return affiliation;
	}

	/**
	 * @param affiliation
	 *            the affiliation to set
	 */
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

}
