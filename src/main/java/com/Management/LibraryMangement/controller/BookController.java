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

import com.Management.LibraryManagement.service.AuthorService;
import com.Management.LibraryManagement.service.BookService;
import com.Management.LibraryManagement.Reposetory.BookRepository;

//Entity Packages
import com.Management.LibraryManagement.entity.Book;
import com.Management.LibraryManagement.entity.Author;

@RestController
@RequestMapping("api/v1/book")
public class BookController {
	
	@Autowired
	private BookService bookService; 
	
	@Autowired
	private AuthorService authorService;
	
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
	
	/*
	 * Extra Methods
	 * assigning the author to the book 
	 */
	
	@PutMapping("/{bookId}/author/{authorId}")
	public Book setAuthorTOBook(@PathVariable int bookId , @PathVariable int authorId) {
		Book book = bookService.findBookById(bookId);
		Author author = authorService.findById(authorId);
		book.setAuthor(author);
		return bookService.save(book);
	}
}
