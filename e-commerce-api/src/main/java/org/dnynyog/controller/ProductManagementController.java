package org.dnynyog.controller;

import java.sql.SQLException;
import java.util.List;

import org.dnynyog.dto.Product;
import org.dnynyog.services.ProductManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductManagementController {

	@Autowired
	ProductManagementService productManagementService;
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct() throws SQLException
	{
		return productManagementService.getAllProduct();
	}
}
