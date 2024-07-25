package org.dnynyog.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.dnynyog.common.DBUtil;
import org.dnynyog.dao.Userdao;
import org.dnynyog.dto.AddUserRequest;
import org.dnynyog.dto.AddUserResponce;
import org.dnynyog.dto.UpdateUserRequest;
import org.dnynyog.dto.UpdateUserResponce;
import org.dnynyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AddUserService {
	@Autowired
	Userdao userdao;
	
	public AddUserResponce addUser(AddUserRequest addUserRequest) throws SQLException,NullPointerException
	{
		Users userTable=new Users();
		userTable.setFirstName(addUserRequest.getFirstName());
		userTable.setLastName(addUserRequest.getLastName());
		userTable.setLoginName(addUserRequest.getLoginName());
		userTable.setAge(addUserRequest.getAge());
		userTable.setGender(addUserRequest.getGender());
		userTable.setEmail(addUserRequest.getEmail());
		userTable.setMobileNo(addUserRequest.getMobileNo());
		userTable.setPassword(addUserRequest.getPassword());
		Users userData=userdao.save(userTable);
		
		AddUserResponce addUserResponce=new AddUserResponce();
		
		addUserResponce.setCodeResponce("0000");
		addUserResponce.setMessage("Add User Data Successfully..!");
		addUserResponce.setRequest(addUserRequest);
		addUserResponce.setUser_id(userData.getId());
		return addUserResponce;
	}
	
	public UpdateUserResponce updateUser(UpdateUserRequest updateUserRequest)
	{
		UpdateUserResponce responce=new UpdateUserResponce();
		
		if(updateUserRequest.getUser_Id()==null)
		{
			responce.setCodeResponce("911");
			responce.setMessage("user_id not sent request,it is mandatory to update.!");
			return responce;
		}
		Users userTable=new Users();
		if(updateUserRequest.getUser_Id()!=userTable.getId())
		{
			responce.setCodeResponce("911");
			responce.setMessage("user_id do not found in table.!");
			return responce;
		}
	
		
		userTable.setId(updateUserRequest.getUser_Id());
		userTable.setFirstName(updateUserRequest.getFirstName());
		userTable.setLastName(updateUserRequest.getLastName());
		userTable.setLoginName(updateUserRequest.getLoginName());
		userTable.setAge(updateUserRequest.getAge());
		userTable.setGender(updateUserRequest.getGender());
		userTable.setEmail(updateUserRequest.getEmail());
		userTable.setMobileNo(updateUserRequest.getMobileNo());
		userTable.setPassword(updateUserRequest.getPassword());
		
		userdao.save(userTable);
		
		responce.setCodeResponce("0000");
		responce.setMessage("Update User Data Successfully..!");
		responce.setRequest(updateUserRequest);
		return responce;
		
		
}
}
