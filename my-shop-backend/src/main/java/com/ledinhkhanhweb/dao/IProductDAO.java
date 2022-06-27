package com.ledinhkhanhweb.dao;

import java.util.List;

import com.ledinhkhanhweb.model.ProductModel;

public interface IProductDAO{
	List<ProductModel> findByCategoryId(Long categoryId);
}
