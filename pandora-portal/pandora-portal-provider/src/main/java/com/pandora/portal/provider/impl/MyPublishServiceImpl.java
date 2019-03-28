package com.pandora.portal.provider.impl;

import java.util.List;

import javax.annotation.Resource;

import com.pandora.portal.model.MyPublish;
import com.pandora.portal.model.service.MyPublishService;
import com.pandora.portal.provider.dao.MyPublishMapper;
import com.papaya.common.extension.Rpc;

@Rpc(MyPublishService.class)
public class MyPublishServiceImpl implements MyPublishService {
	@Resource
	private MyPublishMapper myPublishMapper;

	@Override
	public List<MyPublish> findByPage(String word, int firstSize, int endSize) {
		return myPublishMapper.findByPage(word, firstSize, endSize);
	}

	@Override
	public List<MyPublish> findAll() {
		return myPublishMapper.findAll();
	}

	@Override
	public boolean save(MyPublish publish) {
		System.out.println("===========" + publish.getItemsName());
		return true;
	}

}
