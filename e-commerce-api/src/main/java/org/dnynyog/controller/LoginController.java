package org.dnynyog.controller;

import java.sql.SQLException;

import org.dnynyog.dto.LoginRequest;
import org.dnynyog.dto.LoginResponce;
import org.dnynyog.services.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@PostMapping("/login")
	public LoginResponce login(@RequestBody LoginRequest loginbody) throws SQLException
	{
		return new LoginService().login(loginbody);
	}
}
