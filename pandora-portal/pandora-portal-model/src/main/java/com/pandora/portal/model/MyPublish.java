package com.pandora.portal.model;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.lucene.document.Field;

import com.pandora.common.Header;
import com.pandora.portal.model.enums.EPublishType;
import com.pepper.spring.annotation.Pepper;
import com.pepper.spring.annotation.PepperField;
import com.pepper.spring.base.BaseEntity;
import com.pepper.spring.enums.EDataType;

/**
 * The java bean {@code MyPublish} for love helping business
 * 
 * <p>
 * This object inherits a {@code BaseEntity} to support the search engine module
 * component.
 * <P>
 * {@code Pepper} object is the flag for search engine information.
 * 
 * @author shaobo shih
 * @version 1.0
 * @see BaseEntity
 * @see Pepper
 * 
 */
@Pepper(value = MyPublish.class, path = "/publish")
public class MyPublish extends Header {
	private static final long serialVersionUID = 1L;
	@PepperField(key = "ID", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.BIGDECIMAL)
	private BigDecimal id;
	@PepperField(key = "UserID", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.BIGDECIMAL)
	private BigDecimal userId;
	@PepperField(key = "Type", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.ENUM)
	private EPublishType type;
	@PepperField(key = "ItemsName", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.STRING)
	private String itemsName;
	@PepperField(key = "PublishTime", store = Field.Store.YES, index = Field.Index.NOT_ANALYZED, type = EDataType.DATETIME)
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
