package org.dnynyog.controller;

import java.sql.SQLException;

import org.dnynyog.dto.AddProductRequest;
import org.dnynyog.dto.AddProductResponce;
import org.dnynyog.dto.UpdateProductRequest;
import org.dnynyog.dto.UpdateProductResponce;
import org.dnynyog.services.AddProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddProductController {
	@Autowired
	AddProductService addProductService;
	
	@PostMapping(path="/api/product/addProduct")
	public AddProductResponce addProduct(@RequestBody AddProductRequest addProduct) throws SQLException
	{
		return addProductService.addProduct(addProduct);
	}
	
	@PostMapping(path="/api/product/UpdateProduct")
	public UpdateProductResponce updateProduct(@RequestBody UpdateProductRequest updateProduct)
	{
		return addProductService.updateProduct(updateProduct);
	}
}
