package com.pandora.portal.model.service;

import java.util.List;

import com.pandora.portal.model.MyPublish;

public interface MyPublishService {
	public List<MyPublish> findByPage(String word, int firstSize, int endSize);

	public List<MyPublish> findAll();
	
	public boolean save(MyPublish publish);
}
