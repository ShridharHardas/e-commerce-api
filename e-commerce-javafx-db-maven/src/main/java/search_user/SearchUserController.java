package search_user;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import user_management.UserManagementScreen;

public class SearchUserController {
	@FXML
	TextField firstNameText;
	@FXML
	TextField lastNameText;
	@FXML
	TextField ageText;
	@FXML
	TextField genderText;
	@FXML
	TextField emailText;
	@FXML
	TextField userId;
//	public void searchUser() throws SQLException
//	{
//		String searchUser="select * from user where userFirstName='"+searchName.getText()+"'";
//		ResultSet searchResultSet=DBUtil.executeSelectQuery(searchUser);
//		if(searchResultSet.next())
//		{
//			firstNameText.setText(searchResultSet.getString(2));
//			lastNameText.setText(searchResultSet.getString(3));
//			ageText.setText(searchResultSet.getString(4));
//			genderText.setText(searchResultSet.getString(5));
//			emailText.setText(searchResultSet.getString(6));
//		}
//	}
	public void searchUser() throws SQLException, IOException, InterruptedException
	{
		String url="http://localhost:8080/api/user/getUserById/"+userId.getText()+"";
		String responce=RestUtil.getRequest(url);
		if(responce.contains(userId.getText()))
		{
			firstNameText.setText(responce);
		}
		
	}
	public void backButton()
	{
		new UserManagementScreen().show();
	}

}
