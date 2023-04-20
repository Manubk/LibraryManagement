package com.Management.LibraryMangement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Management.LibraryManagement.entity.Book;
import com.Management.LibraryManagement.entity.BookTracking;
import com.Management.LibraryManagement.entity.User;
import com.Management.LibraryManagement.service.BookService;
import com.Management.LibraryManagement.service.BookTrackingService;
import com.Management.LibraryManagement.service.UserService;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@RestController
@RequestMapping("api/v1/booktracking")
public class BookTrackingController {
	
	@Autowired
	private BookTrackingService bookTrackingService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BookService bookService;
	
	
	@PostMapping("/{userId}/{bookId}")
	public BookTracking saveBookTracking(@PathVariable Integer userId,@PathVariable Integer bookId) {
		System.out.println("book tracking");
//		User user = userService.findById(userId);
		Book book = bookService.findBookById(bookId);
//		System.out.println(user);
		System.out.println(book);
//		BookTracking bookTracking = new BookTracking();
//		bookTracking.setBook(book);
//		bookTracking.setUser(user);
//		return bookTrackingService.save(bookTracking);
		return null;
		
	}

}
