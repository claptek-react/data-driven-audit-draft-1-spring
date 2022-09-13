package com.AMS.amsSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="DD_USERS")
public class UserData {
          
	@Id
	@Column(name ="USER_ID")
	private String id;
	
	@Column(name ="FIRST_NAME")
	private String firstName;
	
	@Column(name ="MIDDLE_NAME")
	private String middleName;
	
	@Column(name ="USER_NAME")
	private String userName;
	
	@Column(name ="LAST_NAME")
	private String lastName;
	
    @Column(name ="FULL_NAME")
    private String fullName;
    
    @Column(name ="EMAIL_ADDRESS")
    private String emailAddress;
    
    @Column(name ="PHONE_NUMBER")
    private String phoneNumber;
    
    @Column(name ="LOCATION")
	private String location;
    
    @Column (name ="START_DATE")
	private String startDate;
	
	@Column(name ="END_DATE")
	private String end_Date;
	
	@Column(name ="ORGANISATION")
	private String organization;
	
	@Column(name ="ROLE")
	private String role;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEnd_Date() {
		return end_Date;
	}

	public void setEnd_Date(String end_Date) {
		this.end_Date = end_Date;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UserData(String id, String firstName, String middleName, String userName, String lastName, String fullName,
			String emailAddress, String phoneNumber, String location, String startDate, String end_Date,
			String organization, String role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.userName = userName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.location = location;
		this.startDate = startDate;
		this.end_Date = end_Date;
		this.organization = organization;
		this.role = role;
	}

	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
   	
}