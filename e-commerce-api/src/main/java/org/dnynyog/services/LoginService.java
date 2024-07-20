package org.dnynyog.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnynyog.dao.Userdao;
import org.dnynyog.dto.LoginRequest;
import org.dnynyog.dto.LoginResponce;
import org.dnynyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class LoginService {
	@Autowired
	Userdao userdao;
	
	public LoginResponce login(LoginRequest loginBody) 
	{
		LoginResponce loginResponce=new LoginResponce();
		//Users users=userdao.findById(1).get();
		//Users users=userdao.findByFirstName(loginBody.user);
		//Users users=userdao.findByPassword(loginBody.password);
		Users users=userdao.findByLoginName(loginBody.user);
		if(users.getLoginName().equals(loginBody.user) && users.getPassword().equals(loginBody.password))
		{
		
			loginResponce.errorCode="0000";
			loginResponce.message="Login Success";
			loginResponce.id=users.getId();
			loginResponce.firstName=users.getFirstName();
			loginResponce.lastName=users.getLastName();
			loginResponce.loginName=users.getLoginName();
			loginResponce.password=users.getPassword();
			return loginResponce;
		}
		else
		{
			loginResponce.errorCode="9111";
			loginResponce.message="Login Failed";
			return loginResponce;
		}
		
	}
		
	}


