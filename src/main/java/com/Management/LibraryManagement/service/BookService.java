package com.Management.LibraryManagement.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Management.LibraryManagement.Reposetory.BookRepository;

//Enitty
import com.Management.LibraryManagement.entity.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public Book save(Book book) {
		return bookRepository.save(book);
	}
	
	public Book findBookById(Integer id) {
		Optional<Book> book = bookRepository.findById(id);
		
		if(book.isEmpty())
			return null;
		else 
			return book.get();
		}
	
	public List<Book> findAll(){
		System.out.println("find all");
		return bookRepository.findAll();
	}
	
	public void delete(Book book) {
		bookRepository.delete(book);
	}
	
	


}
