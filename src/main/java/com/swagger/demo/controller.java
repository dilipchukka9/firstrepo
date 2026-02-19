package com.swagger.demo;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "User API", description = "Operations related to users")

public class controller {
	
	@Autowired
	service service;
	

	


	
	@PostMapping("/user")
	@Operation(summary = "Create user",
    description = "Creates a sample user response")
	public ResponseEntity<User> addusers(@RequestBody User user) {
		Random random = new Random();
		String string = UUID.randomUUID().toString();

	        // random length between 8 and 10
	        int length = 8 + random.nextInt(3);  // 8, 9, or 10

	        String result = string.substring(0, length);
	        int age=random.nextInt(50);
		User addesuser=	service.addusers(new User(0,result,age));
return ResponseEntity.ok(addesuser);
	}
	
	@GetMapping("/user/{id}")
	@Operation(summary = "Get user",
    description = "Creates a sample user response")
	public ResponseEntity<User> getusers(@RequestParam int id) {
		User addesuser=	service.getuser(id);
return ResponseEntity.ok(addesuser);
	}
	
	
	@GetMapping("/user")
	@Operation(summary = "Get user",
    description = "Creates a sample user response")
	public ResponseEntity<List<User>> getallusers() {
		List<User> addesuser=	service.getallusers();
return ResponseEntity.ok(addesuser);
	}
	

}
