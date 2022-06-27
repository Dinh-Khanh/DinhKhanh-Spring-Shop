package com.ledinhkhanhweb.dao.impl;

import java.util.List;

import com.ledinhkhanhweb.dao.IProductDAO;
import com.ledinhkhanhweb.mapper.impl.ProductMapper;
import com.ledinhkhanhweb.model.ProductModel;

public class ProductDAO extends AbstractDAO<ProductModel> implements IProductDAO{

	@Override
	public List<ProductModel> findByCategoryId(Long categoryId) {
		String sql ="SELECT * FROM product WHERE categoryid = ?";
		return query(sql, new ProductMapper(), categoryId);
	}
	

}
