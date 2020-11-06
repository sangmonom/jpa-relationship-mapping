package com.mmit.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

/**
 * Entity implementation class for Entity: Item
 *
 */
@Entity

public class Item implements Serializable {
	@Id
	private int id;
	private String name;
	private int price;
	@ManyToMany
	@JoinTable(name = "Orderdetail", 
	joinColumns = {@JoinColumn(name = "invoice_id"),@JoinColumn(name = "item_id")},
	inverseJoinColumns = {@JoinColumn(name = "order_id")})
	private List<Orders>order;
	private static final long serialVersionUID = 1L;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Item() {
		super();
	}
   
}
