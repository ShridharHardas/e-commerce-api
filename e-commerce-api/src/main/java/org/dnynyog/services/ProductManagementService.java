package org.dnynyog.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dnynyog.common.DBUtil;
import org.dnynyog.dto.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductManagementService {

	public List<Product> getAllProduct() throws SQLException
	{
		String query="select * from product";
		ResultSet result=DBUtil.executeSelectQuery(query);
		ArrayList<Product> productList=new ArrayList<>();
		while(result.next())
		{
			Product product=new Product();
			product.id=result.getInt(1);
			product.productName=result.getString(2);
			product.productQauntity=result.getInt(3);
			product.productPrice=result.getLong(4);
			productList.add(product);
		}
		return productList;
	}
}
