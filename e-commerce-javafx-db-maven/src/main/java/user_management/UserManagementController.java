package user_management;

import add_user.AddUserScreen;
import delete_user.DeleteUserScreen;
import home.HomeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import print_user.PrintUser;
import search_user.SearchUserScreen;
import update_user.UpdateUserViewScreen;

public class UserManagementController {
	@FXML
	Button adduserbutton;
	@FXML
	Button updateuserbutton;
	@FXML
	Button searchbutton;
	@FXML
	Button deleteuserbutton;
	@FXML
	Button printuserbutton;
	@FXML
	Button back;
	
	public void addUserButton()
	{
		new AddUserScreen().show();
	}
	
	public void updateUserButton()
	{
		new UpdateUserViewScreen().show();
	}
	
	public void searchButton()
	{
		new SearchUserScreen().show();
	}
	public void deleteUserButton()
	{
		new DeleteUserScreen().show();
	}
	public void printUserButton()
	{
		new PrintUser().show();
	}
	
	public void backbutton()
	{
		new HomeScreen().show();
	}

}
