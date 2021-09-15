package it.vscalcione.springboot.demoapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.vscalcione.springboot.demoapplication.dto.UserLocationDTO;
import it.vscalcione.springboot.demoapplication.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users-location")
	public List<UserLocationDTO> getAllUsersLocation() {
		return userService.getAllUsersLocation();
	}
}
