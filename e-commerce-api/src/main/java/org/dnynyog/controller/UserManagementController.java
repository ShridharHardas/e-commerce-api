package org.dnynyog.controller;

import java.sql.SQLException;
import java.util.List;

import org.dnynyog.dto.User;
import org.dnynyog.services.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementController {

	@Autowired
	UserManagementService userManagementServices;
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser() throws SQLException
	{
		return userManagementServices.getAllUser();
	}
}
