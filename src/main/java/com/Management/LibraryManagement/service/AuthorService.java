package com.Management.LibraryManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Management.LibraryManagement.Reposetory.AuthorRepository;
import com.Management.LibraryManagement.entity.Author;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	/*
	 * this method for save and update
	 */
	public Author save(Author author) {
		return  authorRepository.save(author);
		
	}

	/*
	 * this is used to find the author by id ;
	 */
	public Author findById(Integer id) {
		Optional<Author> option = authorRepository.findById(id);

		if (option.isEmpty())
			return null;
		else
			return option.get();
	}

	/*
	 * this is used to find all authors ;
	 */
	public List<Author> findAll() {
		return authorRepository.findAll();
	}

	/*
	 * delete the author
	 */
	public void delete(Author author) {
		authorRepository.delete(author);

	}

}
