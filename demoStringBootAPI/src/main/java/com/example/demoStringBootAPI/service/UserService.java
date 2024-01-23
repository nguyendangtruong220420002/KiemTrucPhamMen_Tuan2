package com.example.demoStringBootAPI.service;

import java.util.List;

import com.example.demoStringBootAPI.models.User;

public interface UserService {
	//Post
	User addUser(User user);
	
	//Get
	List<User> allUser();
}
//them cai URDC