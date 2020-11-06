package com.mmit.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.CascadeType.PERSIST;

/**
 * Entity implementation class for Entity: Invoice
 *
 */
@Entity

public class Invoice implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate invoice_date;
	private String staffName;
	@OneToOne(optional = false, fetch = EAGER, cascade = PERSIST)
	@JoinColumn(name = "order_id")
	private Orders order;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getInvoice_date() {
		return invoice_date;
	}

	public void setInvoice_date(LocalDate invoice_date) {
		this.invoice_date = invoice_date;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	private static final long serialVersionUID = 1L;

	public Invoice() {
		super();
	}
   
}
