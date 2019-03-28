package com.pandora.portal.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pandora.common.base.Dao;
import com.pandora.portal.model.MyPublish;

public interface MyPublishMapper extends Dao<MyPublish> {
	/**
	 * Search result for paging
	 * 
	 * @param word
	 *            keywords
	 * @param firstSize
	 *            start number
	 * @param endSize
	 *            end number
	 * @return {@link List}
	 */
	public List<MyPublish> findByPage(@Param("word") String word, @Param("firstSize") int firstSize,
			@Param("endSize") int endSize);
}
