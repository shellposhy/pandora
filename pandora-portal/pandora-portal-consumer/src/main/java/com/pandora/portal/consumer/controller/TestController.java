package com.pandora.portal.consumer.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nanshan.papaya.rpc.client.Client;
import com.nanshan.papaya.rpc.client.ClientFuture;
import com.nanshan.papaya.rpc.client.proxy.IAsyncObject;
import com.pandora.portal.model.MyPublish;
import com.pandora.portal.model.service.MyPublishService;

import cn.com.lemon.base.util.Jsons;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private Client protalClient;

	@SuppressWarnings("static-access")
	@RequestMapping
	@ResponseBody
	public MappingJacksonValue test() {
		MyPublishService helloService = protalClient.create(MyPublishService.class);
		List<MyPublish> list = helloService.findByPage("帮助", Integer.valueOf(1), Integer.valueOf(20));
		String result = Jsons.json(list);
		MappingJacksonValue value = new MappingJacksonValue(result);
		return value;
	}

	@RequestMapping("/test1")
	@ResponseBody
	@SuppressWarnings({ "static-access" })
	public MappingJacksonValue test1() {
		IAsyncObject asyncObject = protalClient.createAsync(MyPublishService.class);
		MyPublish publish = new MyPublish();
		publish.setItemsName("测试测试");
		ClientFuture clientFuture = asyncObject.call("save", publish);
		Object object = null;
		try {
			if (clientFuture != null && clientFuture.get() != null) {
				object = clientFuture.get();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		String result = Jsons.json(object);
		MappingJacksonValue value = new MappingJacksonValue(result);
		return value;
	}

}
