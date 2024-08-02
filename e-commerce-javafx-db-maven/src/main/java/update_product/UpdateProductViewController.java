package update_product;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import product_management.ProductManagementScreen;

public class UpdateProductViewController {
	@FXML
	TextField productIdtoupdate;
	@FXML
	Label errormessage1;
//	public void updateProductExecute() throws SQLException
//	{
//		String checkQuery="select * from product where productName='"+productnametoupdate.getText()+"'";
//		ResultSet updateResultSet=DBUtil.executeSelectQuery(checkQuery);
//		if(updateResultSet.next())
//		{
//			errormessage1.setText("Product Found to update..!");
//			errormessage1.setTextFill(Color.GREEN);
//			new UpdateActualProductScreen().show();
//		}
//		else
//		{
//			errormessage1.setText("Product Not Found..!");
//			errormessage1.setTextFill(Color.RED);
//		}
//	}
	public void updateProductExecute() throws SQLException, IOException, InterruptedException
	{
		String url="http://localhost:8080/api/product/getProductById/"+productIdtoupdate.getText()+"";
		String responce=RestUtil.getRequest(url);
		if(responce.contains(productIdtoupdate.getText()))
		{
			errormessage1.setText("Product Found to update..!");
			errormessage1.setTextFill(Color.GREEN);
			new UpdateActualProductScreen().show();
		}
		else
		{
			errormessage1.setText("Product Not Found..!");
			errormessage1.setTextFill(Color.RED);
		}
	}
	public void backButton()
	{
		new ProductManagementScreen().show();
	}
}
