package com.ledinhkhanhweb.mapper;

import java.sql.ResultSet;

public interface IMapper<T> {
	T mapperModel(ResultSet resultSet);
}
