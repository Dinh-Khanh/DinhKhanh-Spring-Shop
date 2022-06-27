package com.ledinhkhanhweb.dao;

import java.util.List;

import com.ledinhkhanhweb.mapper.IMapper;

public interface IAbstractDAO<T> {
	@SuppressWarnings("hiding")
	<T> List<T> query(String sql, IMapper<T> mapper, Object... parameters);
}
