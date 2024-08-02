package product_management;

import add_product.AddProductScreen;
import delete_product.DeleteProductScreen;
import home.HomeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_product.SearchProductScreen;
import update_product.UpdateProductViewScreen;

public class ProductManagementController {
	@FXML
	Button addproductrbutton;
	@FXML
	Button updateproductbutton;
	@FXML
	Button searchbutton;
	@FXML
	Button deleteproductbutton;
	@FXML
	Button printproductbutton;
	@FXML
	Button back;
	
	public void addProductButton()
	{
		new AddProductScreen().show();
	}
	
	public void updateProductButton()
	{
		new UpdateProductViewScreen().show();
	}
	
	public void searchButton()
	{
		new SearchProductScreen().show();
	}
	public void deleteProductButton()
	{
		new DeleteProductScreen().show();
	}
	public void printProductButton()
	{
		//ProductManagementView.showPrintProductScreen();
	}
	
	public void backbutton()
	{
		new HomeScreen().show();
	}

}
