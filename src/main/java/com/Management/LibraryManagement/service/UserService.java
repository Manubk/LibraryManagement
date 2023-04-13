package com.Management.LibraryManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Management.LibraryManagement.Reposetory.UserRepository;
import com.Management.LibraryManagement.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	//Create
	
	
	public User save(User user) {
		System.out.println("entred service");
		userRepository.save(user);
		return user;
	}
	//Update
	
	//Read
	
	//Delete

}
