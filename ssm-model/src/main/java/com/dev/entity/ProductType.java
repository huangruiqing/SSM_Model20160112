package com.dev.entity;

import java.util.List;

public class ProductType {

	private Long id;
	private String name;// 类别名字
	private List<Product> productList;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	
	
	
	
	
	
	
	
	
	
}
