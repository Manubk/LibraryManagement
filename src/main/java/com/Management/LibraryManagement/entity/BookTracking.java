package com.Management.LibraryManagement.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class BookTracking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	private User user;
	@OneToOne
	private Book book;
	private Date purchaseDate;
	private Date returndate;
	private Boolean returned = Boolean.FALSE;
	
	public BookTracking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookTracking(int id, User user, Book book, Date purchaseDate, Date returndate, Boolean returned) {
		super();
		this.id = id;
		this.user = user;
		this.book = book;
		this.purchaseDate = purchaseDate;
		this.returndate = returndate;
		this.returned = returned;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Date getReturndate() {
		return returndate;
	}

	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}

	public Boolean getReturned() {
		return returned;
	}

	public void setReturned(Boolean returned) {
		this.returned = returned;
	}

	@Override
	public String toString() {
		return "BookTracking [id=" + id + ", user=" + user + ", book=" + book + ", purchaseDate=" + purchaseDate
				+ ", returndate=" + returndate + ", returned=" + returned + "]";
	}
	
	
	
}
