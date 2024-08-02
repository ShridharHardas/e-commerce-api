package delete_product;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import product_management.ProductManagementScreen;

public class DeleteProductController {
	@FXML
	TextField deleteproductId;
	@FXML
	Label errormessage;
	
//	public void deleteProduct() throws SQLException
//	{
//		String deleteQuery="delete from product where productName='"+deleteproduct.getText()+"'";
//		DBUtil.executeQuery(deleteQuery);
//		String checkQuery="select * from product where productName='"+deleteproduct.getText()+"'";
//		ResultSet deleteResultSet=DBUtil.executeSelectQuery(checkQuery);
//		if(deleteResultSet.next())
//		{
//			errormessage.setText("Delete Product Unsuccessfully..!");
//			errormessage.setTextFill(Color.RED);
//		}
//		else
//		{
//			errormessage.setText("Delete Product Successfully..!");
//			errormessage.setTextFill(Color.GREEN);
//		}
//	}
	public void deleteProduct() throws SQLException, IOException, InterruptedException
	{
		String url="http://localhost:8080/api/product/deleteProductById/"+deleteproductId.getText()+"";
		String responce=RestUtil.deleteRequest(url);
		if(responce.contains("0000"))
		{
			errormessage.setText("Delete Product Successfully..!");
			errormessage.setTextFill(Color.GREEN);
		}
		else
		{
			errormessage.setText("Delete Product Unsuccessfully..!");
			errormessage.setTextFill(Color.RED);
		}
	}
	public void backButton()
	{
		new ProductManagementScreen().show();
	}

}
