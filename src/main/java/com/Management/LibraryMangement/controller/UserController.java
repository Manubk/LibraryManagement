package com.Management.LibraryMangement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Management.LibraryManagement.entity.User;
import com.Management.LibraryManagement.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public String save( User user) {
		userService.save(user);
		return "user";
	}
	
	@GetMapping("user/id")
	public String findUserById(Integer id) {
		return "id";
	}
	
	@GetMapping("user")
	public String findUser(Integer id) {
		return "user";
	}
	
	@PutMapping("/user")
	public String updateUser(User user) {
		return "updated";
	}
	
	@DeleteMapping("/user")
	public String deleteUser(User user) {
		return "deleted";
	}

}
