package com.example1.userservice.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.userservice.Entity.User;
import com.example1.userservice.Exceptions.ResourceNotFoundException;
import com.example1.userservice.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	//Database main save krne ke liye repository chahiye so
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
//creting random user id
		//String randomUserId = UUID.randomUUID().toString();
		//user.setUserId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {

		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {

		return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given id is not found on server:"+userId));
	}
//A class which is implementing a interface has to necessarily implement all its methods written in interface
	
	
}
