package com.Management.LibraryManagement.entity;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String role;
	private String email;
	private String password;
	private String phone;

	@CreatedDate
	private String createdDate;
//	private boolean deleted = Boolean.FALSE;

	public User() {
		super();
		System.out.println("User Class initiated");
	}

	public User(int id, String name, String role, String email, String password, String phone, String createdDate) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.createdDate = createdDate;
//		this.deleted = deleted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + ", email=" + email + ", password=" + password
				+ ", phone=" + phone + ", createdDate=" + createdDate + "]";
	}
	
	

}
