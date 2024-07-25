package org.dnynyog.controller;

import java.sql.SQLException;

import org.dnynyog.dto.AddUserRequest;
import org.dnynyog.dto.AddUserResponce;
import org.dnynyog.dto.UpdateUserRequest;
import org.dnynyog.dto.UpdateUserResponce;
import org.dnynyog.services.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {
	@Autowired
	AddUserService addUserService;

	@PostMapping(path = "/api/user/AddUser")
	public AddUserResponce addUser(@RequestBody AddUserRequest addUserRequest) throws SQLException
	{
		return addUserService.addUser(addUserRequest);
	}
	
	@PostMapping(path = "/api/user/UpdateUser")
	public UpdateUserResponce updateUser(@RequestBody UpdateUserRequest updateUserRequest)
	{
		return addUserService.updateUser(updateUserRequest);
	}
}
