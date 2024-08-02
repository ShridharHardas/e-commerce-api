package update_user;

import java.io.IOException;
import java.sql.SQLException;

import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import user_management.UserManagementScreen;

public class UpdateActualController {
	@FXML
	TextField user_idText;
	@FXML
	TextField firstNameText;
	@FXML
	TextField lastNameText;
	@FXML
	TextField loginNameText;
	@FXML
	TextField ageText;
	@FXML
	TextField genderText;
	@FXML
	TextField emailText;
	@FXML
	TextField PasswordText;
	@FXML
	TextField MobileText;
	@FXML
	Label errormessage;
//	public void updateUser() throws SQLException
//	{
//		UpdateUserViewController updateUserViewController=new UpdateUserViewController();
//		String updateQuery="update user set userFirstName='"+firstNameText.getText()+"',userLastName='"+lastNameText.getText()+"',userAge='"+ageText.getText()+"',userGender='"+genderText.getText()+"',userEmail='"+emailText.getText()+"',userPassword='"+passwordText.getText()+"' where userFirstName='"+updateUserViewController.updateName.getText()+"'";
//		DBUtil.executeQuery(updateQuery);
//		errormessage.setText("Update User Successfully..!");
//		errormessage.setTextFill(Color.GREEN);
//	}
	public void updateUser() throws SQLException, IOException, InterruptedException
	{
		
		String url="http://localhost:8080/api/user/UpdateUser";
		String body="{  \r\n"
				+ "    \"firstName\":\""+firstNameText.getText()+"\",\r\n"
				+ "	 \"lastName\":\""+lastNameText.getText()+"\",\r\n"
				+ "     \"loginName\":\""+loginNameText.getText()+"\",\r\n"
				+ "	 \"age\":"+ageText.getText()+",\r\n"
				+ "	 \"gender\":\""+genderText.getText()+"\",\r\n"
				+ "	 \"email\":\""+emailText.getText()+"\",\r\n"
				+ "	 \"mobileNo\":\""+MobileText.getText()+"\",\r\n"
				+ "	 \"password\":\""+PasswordText.getText()+"\",\r\n"
				+ "      \"user_Id\":\""+user_idText.getText()+"\"\r\n"
				+ "}";
		
		String responce=RestUtil.postRequest(url, body);
		if(responce.contains(firstNameText.getText()) && responce.contains(user_idText.getText()))
		{
			errormessage.setText("Update User Successfully..!");
			errormessage.setTextFill(Color.GREEN);
		}
		else
		{
			errormessage.setText("Update User Unsuccessfully..!");
			errormessage.setTextFill(Color.RED);
		}
	}
	public void BackButtonMenu() 
	{
		new UserManagementScreen().show();
	}
}
