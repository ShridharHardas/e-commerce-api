package org.dnynyog.controller;

import java.sql.SQLException;

import org.dnynyog.dto.Login;
import org.dnynyog.services.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@PostMapping("/login")
	public String login(@RequestBody Login loginbody) throws SQLException
	{
		return new LoginService().login(loginbody);
	}
}
