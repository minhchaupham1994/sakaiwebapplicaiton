package com.advancedprogramming.sakai;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MaxId {
	@Id
	private String tableName;
	
	private BigDecimal maxInt;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public BigDecimal getMaxInt() {
		return maxInt;
	}

	public void setMaxInt(BigDecimal maxInt) {
		this.maxInt = maxInt;
	}

}