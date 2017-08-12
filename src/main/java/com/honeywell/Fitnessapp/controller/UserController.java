package com.honeywell.Fitnessapp.controller;

import org.springframework.stereotype.Controller;

import com.honeywell.Fitnessapp.entity.UserFitnessDetails;
import com.honeywell.Fitnessapp.service.UserFitnessDetailsService;
import com.honeywell.Fitnessapp.vo.ResponseVO;

import java.net.URI;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {
	private final UserFitnessDetailsService userService;

	public UserController(final UserFitnessDetailsService userService) {
		this.userService = userService;
	}

	

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
	public ResponseEntity<ResponseVO<UserFitnessDetails>> createUser(@RequestBody UserFitnessDetails user) {
		System.out.println("user.getPushups()**"+user.getPushups());
		
		//return null;
		UserFitnessDetails savedUser = userService.save(user);
		return ResponseEntity.created(URI.create("/" + savedUser.getUserId())).body(new ResponseVO<>(savedUser));
	}
	
	
	

}
