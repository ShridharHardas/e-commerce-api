package org.dnynyog.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnynyog.common.DBUtil;
import org.dnynyog.dto.Login;

public class LoginService {
	public String login(Login loginBody) throws SQLException
	{
		String query="select * from user where userFirstName='"+loginBody.user+"' and userPassword='"+loginBody.password+"' ";
		ResultSet resultSet=DBUtil.executeSelectQuery(query);
		if(resultSet.next())
		{
			return "Login Success";
		}
		else
		{
			return "Login Failed";
		}
	}

}
