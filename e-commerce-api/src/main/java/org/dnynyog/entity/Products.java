package org.dnynyog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Products {
    @Id
    @Column
	private Integer id;
	@Column
	private String productName;
	@Column
	private Integer productQunatity;
	@Column
	private Long productPrice;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductQunatity() {
		return productQunatity;
	}
	public void setProductQunatity(Integer productQunatity) {
		this.productQunatity = productQunatity;
	}
	public Long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}
	
}
