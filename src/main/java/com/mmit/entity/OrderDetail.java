package com.mmit.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrderDetail
 *
 */
@Entity

public class OrderDetail implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int subQty;
	private int subPrice;
	@EmbeddedId
	private OrderdetailPK id;
	
	public int getSubQty() {
		return subQty;
	}

	public void setSubQty(int subQty) {
		this.subQty = subQty;
	}

	public int getSubPrice() {
		return subPrice;
	}

	public void setSubPrice(int subPrice) {
		this.subPrice = subPrice;
	}

	public OrderdetailPK getId() {
		return id;
	}

	public void setId(OrderdetailPK id) {
		this.id = id;
	}

	public OrderDetail() {
		super();
	}
   
}
