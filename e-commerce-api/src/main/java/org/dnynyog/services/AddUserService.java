package org.dnynyog.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnynyog.common.DBUtil;
import org.dnynyog.dto.AddUserRequest;
import org.dnynyog.dto.AddUserResponce;

public class AddUserService {
	
	public AddUserResponce addUser(AddUserRequest addUserRequest) throws SQLException
	{
		AddUserResponce addUserResponce=new AddUserResponce();
		String query="insert into user(FirstName, LastName,Age,Gender,Email,Mobile,Password) values('"+addUserRequest.firstName+"','"+addUserRequest.lastName+"',"
				+ "'"+addUserRequest.age+"','"+addUserRequest.gender+"','"+addUserRequest.email+"','"+addUserRequest.mobileNo+"','"+addUserRequest.password+"')";
		DBUtil.executeQuery(query);
		String selectQuery="select * from user where FirstName='"+addUserRequest.firstName+"' and LastName='"+addUserRequest.lastName+"'";
		ResultSet result=DBUtil.executeSelectQuery(selectQuery);
		if(result.next())
		{
			addUserResponce.errorCode="0000";
			addUserResponce.message="Add User Data Successfully..!";
			return addUserResponce;
		}
		else
		{
			addUserResponce.errorCode="911";
			addUserResponce.message="Add User Data Failed";
			return addUserResponce;
		}
	}

}
