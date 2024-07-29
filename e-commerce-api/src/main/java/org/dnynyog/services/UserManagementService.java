package org.dnynyog.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.dnynyog.common.DBUtil;
import org.dnynyog.dao.Userdao;
import org.dnynyog.dto.DeleteResponce;
import org.dnynyog.dto.User;
import org.dnynyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import static org.dnynyog.common.JavaUtil.isNull;

@Component
public class UserManagementService {
	
	@Autowired
	Userdao userdao;
	
	
	public List<Users> getAllUser() throws SQLException
	{
	  return userdao.findAll();
	}
	
	public Users getUserById(Integer user_id )
	{
		return userdao.findById(user_id).get();
	}
	
	public DeleteResponce deleteUserById(Integer user)
	{
		DeleteResponce responce=new DeleteResponce();
		
		Optional<Users> users=userdao.findById(user);
		if(users.isPresent())
		{	userdao.deleteById(user);
			responce.setRepsonceCode("0000");
			responce.setStatus("Delete User Data Successfully..!");
			return responce;
		}
		else
		{
			responce.setRepsonceCode("9111");
			responce.setStatus("Delete User Data unsuccessfully..!");
			return responce;
		}
	}
	
	
}
