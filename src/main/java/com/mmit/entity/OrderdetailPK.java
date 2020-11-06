package com.mmit.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class OrderdetailPK implements Serializable {
	private static final long serialVersionUID = 1L;
	private int itemid;
	private int orderid;
	
	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemid;
		result = prime * result + orderid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderdetailPK other = (OrderdetailPK) obj;
		if (itemid != other.itemid)
			return false;
		if (orderid != other.orderid)
			return false;
		return true;
	}
	

	
	
}
