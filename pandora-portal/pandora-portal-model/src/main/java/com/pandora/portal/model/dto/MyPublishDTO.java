package com.pandora.portal.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.pandora.portal.model.MyPublish;
import com.pandora.portal.model.enums.EPublishType;

/**
 * Publish {@code MyPublish} data transfer object
 * 
 * @see MyPublish
 * @author shaobo shih
 * @version 1.0
 */
public class MyPublishDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private BigDecimal id;
	private BigDecimal userId;
	private EPublishType type;
	private String itemsName;
	private Date publishTime;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getUserId() {
		return userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	public EPublishType getType() {
		return type;
	}

	public void setType(EPublishType type) {
		this.type = type;
	}

	public String getItemsName() {
		return itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

}
