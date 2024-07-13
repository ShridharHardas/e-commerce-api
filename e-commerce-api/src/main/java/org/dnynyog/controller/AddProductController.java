package org.dnynyog.controller;

import java.sql.SQLException;

import org.dnynyog.dto.AddProductRequest;
import org.dnynyog.dto.AddProductResponce;
import org.dnynyog.services.AddProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddProductController {
	@PostMapping("/addProduct")
	public AddProductResponce addProduct(@RequestBody AddProductRequest addProduct) throws SQLException
	{
		return new AddProductService().addProduct(addProduct);
	}
}
