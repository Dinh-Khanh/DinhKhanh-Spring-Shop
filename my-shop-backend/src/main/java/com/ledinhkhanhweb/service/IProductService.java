package com.ledinhkhanhweb.service;

import java.util.List;

import com.ledinhkhanhweb.model.ProductModel;

public interface IProductService {
	List<ProductModel> findByCategoryId(Long categoryId);
}
