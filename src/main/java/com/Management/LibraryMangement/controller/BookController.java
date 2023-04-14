package com.Management.LibraryMangement.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Management.LibraryManagement.service.BookService;

//Entity Packages
import com.Management.LibraryManagement.entity.Book;

@RestController
@RequestMapping("api/v1/book")
public class BookController {
	
	@Autowired
	private BookService bookService; 
	
	@PostMapping("")
	public Book saveBook(@RequestBody Book book) {
	 return	bookService.save(book);
	}
	
	@GetMapping("")
	public List<Book> findAll(){
		System.out.println("book controller");
		return bookService.findAll();
	}
	
	@GetMapping("/{id}")
	public Book findById(@PathVariable Integer id) {
		return bookService.findBookById(id);
	}
	
	@PutMapping("")
	public Book update(Book book) {
		return bookService.save(book);
	}
	
	@DeleteMapping("")
	public void delete(Book book) {
		bookService.delete(book);
	}
}
