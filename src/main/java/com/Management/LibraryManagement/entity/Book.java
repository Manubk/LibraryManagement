package com.Management.LibraryManagement.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int cost;
	private int quantity;
	
	@JsonIgnore
	@ManyToOne
	private Author author;
	
	@OneToMany(mappedBy = "book")
	private List<BookTracking> bookTracking;
	
	public Book() {
		super();
		System.out.println("Book super class constructor");
	}

	public Book(int id, String name, int cost, int quantity, Author author, List<BookTracking> bookTracking) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.author = author;
		this.bookTracking = bookTracking;
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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<BookTracking> getBookTracking() {
		return bookTracking;
	}

	public void setBookTracking(List<BookTracking> bookTracking) {
		this.bookTracking = bookTracking;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", cost=" + cost + ", quantity=" + quantity + ", author=" + author
				+ ", bookTracking=" + bookTracking + "]";
	}



	
	
	
	
	
}
