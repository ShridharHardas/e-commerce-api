package org.dnynyog.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnynyog.common.DBUtil;
import org.dnynyog.dto.LoginRequest;
import org.dnynyog.dto.LoginResponce;

public class LoginService {
	
	public LoginResponce login(LoginRequest loginBody) throws SQLException
	{
		LoginResponce loginResponce=new LoginResponce();
		String query="select * from user where userFirstName='"+loginBody.user+"' and userPassword='"+loginBody.password+"' ";
		ResultSet resultSet=DBUtil.executeSelectQuery(query);
		if(resultSet.next())
		{
			loginResponce.errorCode="0000";
			loginResponce.message="Login Success";
			return loginResponce;
		}
		else
		{
			loginResponce.errorCode="911";
			loginResponce.message="Login Failed";
			return loginResponce;
		
		}
	}

}
