package home;

import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login.LoginScreen;
import product_management.ProductManagementScreen;
import user_management.UserManagementScreen;

public class HomeScreenController {
	@FXML
	Button adduserbutton;
	@FXML
	Button addproductbutton;
	@FXML
	Button logoutbutton;
	
	public void addUserButton() {
		System.out.println("Add User Button");
		new UserManagementScreen().show();
		
	}
	public void addProductButton() {
		System.out.println("Add Product Button");
		new ProductManagementScreen().show();
	}
	public void LogoutButton() throws SQLException {
		System.out.println("Logout Button");
		new LoginScreen().show();
	}

}
