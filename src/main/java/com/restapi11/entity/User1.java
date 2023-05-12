package com.restapi11.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user1")
public class User1 {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "userId")
	private int userId;
	@Column(name = "userName")
	private String userName;
	@Column(name = "userEmailId")
	private String userEmailId;
	@Column(name = "userPassword")
	private String userPassword;
	@Column(name = "role")
	private String role;
	
	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User1(int userId, String userName, String userEmailId, String userPassword, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmailId = userEmailId;
		this.userPassword = userPassword;
		this.role = role;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
