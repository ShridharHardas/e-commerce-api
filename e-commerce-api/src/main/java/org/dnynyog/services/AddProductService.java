package org.dnynyog.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.dnynyog.common.DBUtil;
import org.dnynyog.dao.Productdao;
import org.dnynyog.dao.Userdao;
import org.dnynyog.dto.AddProductRequest;
import org.dnynyog.dto.AddProductResponce;
import org.dnynyog.dto.UpdateProductRequest;
import org.dnynyog.dto.UpdateProductResponce;
import org.dnynyog.dto.UpdateUserResponce;
import org.dnynyog.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AddProductService {
	@Autowired
	Productdao productdao;
	
	public AddProductResponce addProduct(AddProductRequest request) throws SQLException
	{
		Products productTable=new Products();
		productTable.setProductName(request.getProductName());
		productTable.setProductPrice(request.getProductPrice());
		productTable.setProductQunatity(request.getProductQuantity());
		
		Products product=productdao.save(productTable);
		
		AddProductResponce responce=new AddProductResponce();
		responce.setCodeResponce("0000");
		responce.setMessage("Add Product Successfully..!");
		responce.setProduct_id(product.getId());
		responce.setRequest(request);
		
		return responce;
	}
	
	public UpdateProductResponce updateProduct(UpdateProductRequest updateRequest)
	{	
		UpdateProductResponce responce=new UpdateProductResponce();
		Products productTable=new Products();
		if(updateRequest.getProduct_id()==null)
		{
			responce.setCodeResponce("911");
			responce.setMessage("product_id not sent request,it is mandatory to update.!");
			return responce;
		}
		
		Optional<Products> productData=productdao.findById(updateRequest.getProduct_id());
		
		if(productData.isPresent())
		{
		productTable.setId(updateRequest.getProduct_id());
		productTable.setProductName(updateRequest.getProductName());
		productTable.setProductQunatity(updateRequest.getProductQuantity());
		productTable.setProductPrice(updateRequest.getProductPrice());
		productdao.save(productTable);
		
		responce.setCodeResponce("0000");
		responce.setMessage("Update Product Data Successfully..!");
		responce.setRequest(updateRequest);
		return responce;
		}
		else
		{
			responce.setCodeResponce("9111");
			responce.setMessage("product_id not found in the table..!");
			return responce;
		}

}
}
