package search_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import product_management.ProductManagementScreen;

public class SearchProductController {
	@FXML
	TextField productnametosearch;
	@FXML
	TextField searchName;
	@FXML
	TextField searchQuantity;
	@FXML
	TextField searchPrice;
	@FXML
	Label errormessage;
	@FXML
	Button productsearch;
	
	public void searchProduct() throws SQLException
	{
		String searchProductName=productnametosearch.getText();
		String checkQuery="select * from product where productName='"+searchProductName+"'";
		ResultSet searchResultSet=DBUtil.executeSelectQuery(checkQuery);
		if(searchResultSet.next())
		{
			searchName.setText(searchResultSet.getString(2));
			searchQuantity.setText(searchResultSet.getString(3));
			searchPrice.setText(searchResultSet.getString(4));
		}
		else
		{
			errormessage.setText("Product Not Found..!");
			errormessage.setTextFill(Color.RED);
		}
	}
	public void backbutton()
	{
		new ProductManagementScreen().show();
	}
}
