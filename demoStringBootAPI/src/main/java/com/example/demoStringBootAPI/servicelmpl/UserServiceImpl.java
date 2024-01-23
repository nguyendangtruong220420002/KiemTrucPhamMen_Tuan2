package com.example.demoStringBootAPI.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoStringBootAPI.models.User;
import com.example.demoStringBootAPI.repository.UserRepository;
import com.example.demoStringBootAPI.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> allUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	

}
