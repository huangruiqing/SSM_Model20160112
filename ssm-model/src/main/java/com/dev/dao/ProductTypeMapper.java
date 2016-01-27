package com.dev.dao;

import com.dev.entity.ProductType;

public interface ProductTypeMapper {

	public ProductType findByTypeWithProduct(Long id);
	
}
