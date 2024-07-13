package org.dnynyog.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnynyog.common.DBUtil;
import org.dnynyog.dto.AddProductRequest;
import org.dnynyog.dto.AddProductResponce;

public class AddProductService {
	public AddProductResponce addProduct(AddProductRequest addProduct) throws SQLException
	{
		AddProductResponce addProductResponce=new AddProductResponce();
		String query="insert into product( productName, productQuantity, productPrice) values('"+addProduct.productName+"','"+addProduct.productQuantity+"','"+addProduct.productPrice+"')";
		DBUtil.executeQuery(query);
		String selectQuery="select * from product where productName='"+addProduct.productName+"'";
		ResultSet result=DBUtil.executeSelectQuery(selectQuery);
		if(result.next())
		{
			addProductResponce.errorCode="000";
			addProductResponce.message="Product Addition Successfully..!";
			return addProductResponce;
		}
		else
		{
			addProductResponce.errorCode="9111";
			addProductResponce.message="Product Addition Failed";
			return addProductResponce;
		}
	}

}
