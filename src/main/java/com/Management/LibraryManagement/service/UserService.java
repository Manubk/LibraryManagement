package com.Management.LibraryManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.StackWalker.Option;
import java.util.*;

import com.Management.LibraryManagement.Reposetory.UserRepository;
import com.Management.LibraryManagement.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	//Create
	//Update
	public User save(User user) {
		System.out.println("entred service");
		userRepository.save(user);
		return user;
	}
	
	
	//Read all
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	//read one record
	public User findById(Integer id) {
		System.out.println("find user");
		Optional<User> option = userRepository.findById(id);
		if(option.isPresent()) {
			return option.get();
		}else {
			return null;
		}
	}
	
	
	//Delete
	public Void deleteUser(User user) {
		userRepository.delete(user);
		return null;
	}
}
