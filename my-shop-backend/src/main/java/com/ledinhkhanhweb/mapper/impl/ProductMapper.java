package com.ledinhkhanhweb.mapper.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ledinhkhanhweb.mapper.IMapper;
import com.ledinhkhanhweb.model.ProductModel;

public class ProductMapper implements IMapper<ProductModel>{

	@Override
	public ProductModel mapperModel(ResultSet resultSet) {
		try {
			ProductModel product = new ProductModel();
			product.setId(resultSet.getLong("id"));
			product.setName(resultSet.getString("name"));
			product.setDescription(resultSet.getString("description"));
			product.setCategoryId(resultSet.getLong("categoryid"));
			product.setPrice(resultSet.getInt("price"));
			product.setCreatedDate(resultSet.getTimestamp("createddate"));
			product.setCreatedBy(resultSet.getString("createdby"));
			product.setModifiedDate(resultSet.getTimestamp("modifieddate"));
			product.setModdifiedBy(resultSet.getString("modifiedby"));
			return product;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Product mapper erro!");
			return null;
		}
	}
	

}
