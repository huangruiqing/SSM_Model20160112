package com.dev.dao;

import java.util.List;

import com.dev.entity.Product;

public interface ProductMapper {

	public Product findById(Long id);
	public List<Product> findProductWithType();
	
	
}
