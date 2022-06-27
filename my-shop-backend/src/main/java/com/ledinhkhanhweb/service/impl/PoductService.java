package com.ledinhkhanhweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.ledinhkhanhweb.dao.IProductDAO;
import com.ledinhkhanhweb.model.ProductModel;
import com.ledinhkhanhweb.service.IProductService;

public class PoductService implements IProductService{

	@Inject
	private IProductDAO productDao;
	
	@Override
	public List<ProductModel> findByCategoryId(Long categoryId) {
		return productDao.findByCategoryId(categoryId);
	}

}
