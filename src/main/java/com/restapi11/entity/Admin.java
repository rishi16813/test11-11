package com.restapi11.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "adminId")
	private int adminId;
	@Column(name = "adminName")
	private String adminName;
	@Column(name = "adminEmailId")
	private String adminEmailId;
	@Column(name = "adminPassword")
	private String adminPassword;
	@Column(name = "role")
	private String role;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User1 user1;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int adminId, String adminName, String adminEmailId, String adminPassword, String role, User1 user1) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmailId = adminEmailId;
		this.adminPassword = adminPassword;
		this.role = role;
		this.user1 = user1;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmailId() {
		return adminEmailId;
	}
	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User1 getUser1() {
		return user1;
	}
	public void setUser1(User1 user1) {
		this.user1 = user1;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmailId=" + adminEmailId
				+ ", adminPassword=" + adminPassword + ", role=" + role + ", user1=" + user1 + "]";
	}
	
	
	
	
	

}
