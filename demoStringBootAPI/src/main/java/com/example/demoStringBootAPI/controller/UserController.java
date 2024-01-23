package com.example.demoStringBootAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoStringBootAPI.models.User;
import com.example.demoStringBootAPI.service.UserService;

@RestController
@RequestMapping(value = "/user/truong")
public class UserController {

	@Autowired
	private UserService userService;
	//post
	@PostMapping(value = "/addUser")
	public User adduser (@RequestBody User user) {
		return userService.addUser(user);
	}
	//get
	@GetMapping(value = "/allUsers")
	public List<User> getAUsers(){
		return userService.allUser();	
	}
}
// tao link 6
