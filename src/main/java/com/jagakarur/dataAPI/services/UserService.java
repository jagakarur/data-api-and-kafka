package com.jagakarur.dataAPI.services;

import com.jagakarur.dataAPI.model.User;
import com.jagakarur.dataAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	public User fetchUser(String userName) {
		return userRepository.findByUserName(userName); 
	}
}
