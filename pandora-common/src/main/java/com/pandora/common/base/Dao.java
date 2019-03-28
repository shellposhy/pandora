package com.pandora.common.base;

import java.math.BigDecimal;
import java.util.List;

/**
 * {@code Dao} The java base class for data access object
 * 
 * @author shaobo shih
 * @version 1.0
 */
public interface Dao<T> {
	List<T> findAll();

	T find(BigDecimal id);

	boolean insert(T t);

	boolean update(T t);

	boolean delete(BigDecimal id);
}
