package org.dnynyog.controller;

import java.sql.SQLException;
import java.util.List;

import org.dnynyog.dto.AddUserRequest;
import org.dnynyog.dto.AddUserResponce;
import org.dnynyog.dto.DeleteResponce;
import org.dnynyog.dto.UpdateUserRequest;
import org.dnynyog.dto.UpdateUserResponce;
import org.dnynyog.entity.Users;
import org.dnynyog.services.AddUserService;
import org.dnynyog.services.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {
	@Autowired
	AddUserService addUserService;
	@Autowired
	UserManagementService userManagementService;

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
	
	@GetMapping(path="/api/user/getAllUser")
	public List<Users> getAllUser() throws SQLException
	{
		return userManagementService.getAllUser();
	}
	
	@GetMapping(path="/api/user/getUserById/{user_id}")
	public Users getUserById(@PathVariable Integer user_id )
	{
		return userManagementService.getUserById(user_id);
	}
	
	@DeleteMapping(path="/api/user/deleteUserById/{user_id}")
	public DeleteResponce deleteUserById(@PathVariable Integer user_id)
	{
		return userManagementService.deleteUserById(user_id);
	}
}
