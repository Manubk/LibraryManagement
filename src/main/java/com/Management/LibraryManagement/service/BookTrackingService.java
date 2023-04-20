package com.Management.LibraryManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Management.LibraryManagement.Reposetory.BookRepository;
import com.Management.LibraryManagement.entity.BookTracking;

@Service
public class BookTrackingService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public BookTracking save(BookTracking bookTracking) {
		return bookRepository.save(bookTracking);
	}

}
