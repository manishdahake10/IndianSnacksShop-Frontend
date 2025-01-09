package com.ts.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long adminId;
	
	@Column(nullable = false, unique = true)
	private String userName;
	
	@Column(nullable = false)
	private String passwardHash;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	
	private String fullName;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	private String mobileNo;
	
	private String profilePicture;
	
	private String accountStatus;
	
	@Column(nullable = false, updatable = false)
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;
	
	public enum Role{
		admin
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswardHash() {
		return passwardHash;
	}

	public void setPasswardHash(String passwardHash) {
		this.passwardHash = passwardHash;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Admin() {}
	public Admin(long adminId, String userName, String passwardHash, String email, String fullName, Role role,
			String mobileNo, String profilePicture, String accountStatus, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		
		this.adminId = adminId;
		this.userName = userName;
		this.passwardHash = passwardHash;
		this.email = email;
		this.fullName = fullName;
		this.role = role;
		this.mobileNo = mobileNo;
		this.profilePicture = profilePicture;
		this.accountStatus = accountStatus;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	
	
}
