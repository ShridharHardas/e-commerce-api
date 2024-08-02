package login;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.*;
import home.HomeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


public class LoginController {
	@FXML
	TextField username;
	@FXML
	TextField password;
	@FXML
	Label error_message;
	
	public void userClickLogin() throws SQLException, IOException, InterruptedException
	{
//		String userFromJavaFx=username.getText();
//		String passwordFromJavaFx=password.getText();
//	String validateUser="select * from user where userFirstName='"+userFromJavaFx+"' &&  userPassword='"+passwordFromJavaFx+"'";
//		ResultSet validate=DBUtil.executeSelectQuery(validateUser);
		String url="http://localhost:8080/login";
		String body="{   \r\n"
				+ "    \"user\":\""+username.getText()+"\",\r\n"
				+ "	 \"password\":\""+password.getText()+"\"\r\n"
				+ "}";
		String reponce=RestUtil.postRequest(url, body);
		if(reponce.contains("Login Success"))
		{
			error_message.setText("Login Success");
			error_message.setTextFill(Color.GREEN);
			new HomeScreen().show();
		}
		else
		{
			error_message.setText("Login Failed");
			error_message.setTextFill(Color.RED);
		}
	}
}
