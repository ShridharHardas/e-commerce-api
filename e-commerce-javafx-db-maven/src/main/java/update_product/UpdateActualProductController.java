package update_product;

import java.io.IOException;
import java.sql.SQLException;

import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import product_management.ProductManagementScreen;

public class UpdateActualProductController {
	@FXML
	TextField productId;
	@FXML
	TextField productname;
	@FXML
	TextField productquantity;
	@FXML
	TextField productprice;
	@FXML
	Label errormessage2;

	public void updateProduct() throws SQLException, IOException, InterruptedException
	{
		String url="http://localhost:8080/api/product/UpdateProduct";
		String body="{   \r\n"
				+ "    \"productName\":\""+productname.getText()+"\",\r\n"
				+ "	 \"productQuantity\":"+productquantity.getText()+",\r\n"
				+ "     \"productPrice\":"+productprice.getText()+",\r\n"
				+ "     \"product_id\":"+productId.getText()+"\r\n"
				+ "}";
		String responce=RestUtil.postRequest(url, body);
		if(responce.contains(productId.getText()))
		{
			errormessage2.setText("Product Update Successfully..!");
			errormessage2.setTextFill(Color.GREEN);
		}
		else
		{
			errormessage2.setText("Product Update Unsuccessfully..!");
			errormessage2.setTextFill(Color.RED);
		}
	}
	public void BackButton()
	{
		new ProductManagementScreen().show();
	}
}
