package com.Management.LibraryMangement.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Management.LibraryManagement.service.BookService;

//Entity Packages
import com.Management.LibraryManagement.entity.Book;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService; 
	
	@GetMapping("/")
	public String home() {
		System.out.println("all books");
		return "home";
	}
	
	@GetMapping("/books")
	public List<Book> findAll(){
		System.out.println("all books");
		return new ArrayList<>();
	}
	@PostMapping("/book")
	public void saveBook(@RequestBody Book book) {
		System.out.println( "book creaated");
	}
	
	
}
