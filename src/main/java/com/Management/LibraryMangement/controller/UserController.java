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

import com.Management.LibraryManagement.entity.User;
import com.Management.LibraryManagement.service.UserService;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/*
	 * This saves the date into database for url: /user
	 */
	@PostMapping("")
	public User save(@RequestBody User user) {
		System.out.println(user.toString());
		user = userService.save(user);
		return user;
	}
	
	/*
	 * This will return the user based on id for url: /user/id
	 */
	@GetMapping("/{id}")
	public User findUserById(@PathVariable Integer id) {
		return userService.findById(id);
	}
	
	/*
	 * This will return list of users  for url: /user
	 */
	@GetMapping("")
	public List<User> findUser() {
		return userService.findAll();
	}
	
	/*
	 * This will update the data into database for url: /user
	 */
	@PutMapping("")
	public User updateUser(@RequestBody User user) {
		user = userService.save(user);
		return user;
	}
	
	/*
	 * This will delte the data fron database for url: /user
	 */
	@DeleteMapping("")
	public String deleteUser(@RequestBody User user) {
		userService.deleteUser(user);
		return "deleted";
	}

}
