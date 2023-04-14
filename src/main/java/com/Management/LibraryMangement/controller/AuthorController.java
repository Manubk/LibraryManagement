package com.Management.LibraryMangement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Management.LibraryManagement.entity.Author;
import com.Management.LibraryManagement.service.AuthorService;

@RestController
@RequestMapping("api/v1/author")
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	
	@PostMapping("")
	public Author save(@RequestBody Author author) {
		authorService.save(author);
		return author;
	}
	
	@GetMapping("/{id}")
	public Author findById(@PathVariable Integer id) {
		return authorService.findById(id);	
	}
	
	@GetMapping("")
	public List<Author> findAll(){
		return authorService.findAll();
	}
	
	@DeleteMapping("")
	public String delete(@RequestBody Author author) {
		author.toString();
		authorService.delete(author);
		return null;
	}
	
	@PutMapping("")
	public Author update(@RequestBody Author authro) {
		return authorService.save(authro);
	}
}
