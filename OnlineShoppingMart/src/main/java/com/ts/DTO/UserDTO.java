package com.ts.DTO;

public class UserDTO {

	private Integer userId;
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String emailId;
	private String passwardHash;
	private String residentialAddress;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPasswardHash() {
		return passwardHash;
	}
	public void setPasswardHash(String passwardHash) {
		this.passwardHash = passwardHash;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public UserDTO() {}
	public UserDTO(Integer userId, String firstName, String lastName, String mobileNo, String emailId,
			String passwardHash, String residentialAddress) {
		
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.passwardHash = passwardHash;
		this.residentialAddress = residentialAddress;
	}
	
	
}
