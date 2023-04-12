package com.Management.LibraryManagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Management.LibraryManagement.Reposetory.BookRepository;

//Enitty
import com.Management.LibraryManagement.entity.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> findAll(){
		System.out.println("finding all");
		return bookRepository.findAll();
	}
}
