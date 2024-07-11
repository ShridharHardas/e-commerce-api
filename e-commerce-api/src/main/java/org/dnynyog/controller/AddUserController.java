package org.dnynyog.controller;

import java.sql.SQLException;

import org.dnynyog.dto.AddUserRequest;
import org.dnynyog.dto.AddUserResponce;
import org.dnynyog.services.AddUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {

	@PostMapping("/addUser")
	public AddUserResponce addUser(@RequestBody AddUserRequest addUserRequest) throws SQLException
	{
		return new AddUserService().addUser(addUserRequest);
	}
}
