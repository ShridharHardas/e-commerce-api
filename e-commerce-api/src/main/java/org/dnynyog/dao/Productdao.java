package org.dnynyog.dao;

import org.dnynyog.dto.Product;
import org.dnynyog.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productdao extends JpaRepository<Products, Integer>{

}
