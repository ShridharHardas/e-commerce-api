package add_product;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import product_management.ProductManagementScreen;

public class AddProductController {
	@FXML
	TextField productname;
	@FXML
	TextField productquantity;
	@FXML
	TextField productprice;
	@FXML
	Label errormessage;
	
	public void addProduct() throws SQLException, IOException, InterruptedException
	{
		String url="http://localhost:8080/api/product/addProduct";
		String body="{   \r\n"
				+ "    \"productName\":\""+productname.getText()+"\",\r\n"
				+ "	 \"productQuantity\":"+productquantity.getText()+",\r\n"
				+ "     \"productPrice\":"+productprice.getText()+"\r\n"
				+ "}";
		String responce=RestUtil.postRequest(url, body);
		if(responce.contains("0000"))
		{
			errormessage.setText("Product Addition Successfully..!");
			errormessage.setTextFill(Color.GREEN);
		}
		else
		{
			errormessage.setText("Product Already Exits..!");
			errormessage.setTextFill(Color.RED);
		}
	}
	public void backbutton()
	{
		new ProductManagementScreen().show();
	}
}
