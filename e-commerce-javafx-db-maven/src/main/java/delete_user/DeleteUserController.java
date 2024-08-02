package delete_user;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import user_management.UserManagementScreen;

public class DeleteUserController {
	@FXML
	 TextField deleteUserId;
	 @FXML
	 Label errormessage;
	
//	public void deleteUser() throws SQLException
//	{
//		String deleteQuery="delete from user where userFirstName='"+deleteName.getText()+"'";
//		DBUtil.executeQuery(deleteQuery);
//		String checkQuery="select * from user where userFirstName='"+deleteName.getText()+"'";
//		ResultSet checkResultSet=DBUtil.executeSelectQuery(checkQuery);
//		if(checkResultSet.next())
//		{
//			errormessage.setText("Delete user unsuccesfully..!");
//			errormessage.setTextFill(Color.RED);
//		}
//		else
//		{
//			errormessage.setText("Delete user Succesfully..!");
//			errormessage.setTextFill(Color.GREEN);
//		}
//	}
	
	 public void deleteUser() throws SQLException, IOException, InterruptedException
	{
		 	String url="http://localhost:8080/api/user/deleteUserById/"+deleteUserId.getText();
		 	String responce=RestUtil.deleteRequest(url);
		 	if(responce.contains("Successfully"))
		 	{
		 		errormessage.setText("Delete user Succesfully..!");
				errormessage.setTextFill(Color.GREEN);
		 	}
		 	else
		 	{
		 		errormessage.setText("Delete user unsuccesfully..!");
				errormessage.setTextFill(Color.RED);
		 	}
	 }
	 
	 public void backButton()
	{
		 new UserManagementScreen().show();
	}

}
