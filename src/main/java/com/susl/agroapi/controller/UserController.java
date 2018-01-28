package com.susl.agroapi.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.susl.agroapi.model.User;
import com.susl.agroapi.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
    UserRepository userRepository;
	
	@GetMapping("/user")
	public List<User> getAllNotes() {
	    return userRepository.findAll();
	}


//	 Create a new User
	@PostMapping("/user")
	public @Valid User createUser(@Valid @RequestBody User user) {
		System.err.println(user);
	    return userRepository.save(user);
	}
	
	// Get a Single Note
	@GetMapping("/user/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable(value = "id") Long userId) {
	    Optional<User> user = userRepository.findById(userId);
	    if(user == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(user);
	}
	
	


}
