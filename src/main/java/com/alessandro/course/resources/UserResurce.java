package com.alessandro.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alessandro.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResurce {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L,  "Maria", "maria@gmail.com", "99999999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
