package com.Management.LibraryManagement.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String role;
	private String email;
	private String password;
	private String phone;

	@CreatedDate
	private Date createdAt;
	
	@LastModifiedDate
	private Date lastUpdatedAt;
	
	@OneToMany(mappedBy = "user")
	private List<BookTracking> booktracking;

	public User() {
		super();
		System.out.println("User Class initiated");
	}

	public User(int id, String name, String role, String email, String password, String phone, Date createdAt,
			Date lastUpdatedAt, List<BookTracking> booktracking) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.createdAt = createdAt;
		this.lastUpdatedAt = lastUpdatedAt;
		this.booktracking = booktracking;
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

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(Date lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public List<BookTracking> getBooktracking() {
		return booktracking;
	}

	public void setBooktracking(List<BookTracking> booktracking) {
		this.booktracking = booktracking;
	}

	


}
