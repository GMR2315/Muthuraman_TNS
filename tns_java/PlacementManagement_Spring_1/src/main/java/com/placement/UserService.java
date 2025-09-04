package com.placement;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	public Optional<User> findUserById(Long id){
		return userRepository.findById(id);
	}
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	public void deleteUser(Long id) {
		 userRepository.deleteById(id);
	}
	
	public User updateUser(Long id,User userDetails) {
		User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
		user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        user.setPhoneNumber(userDetails.getPhoneNumber());
        return userRepository.save(user);
		
	}

}
