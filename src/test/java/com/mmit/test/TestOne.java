package com.mmit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.mmit.entity.Invoice;
import com.mmit.entity.Orders;
@TestMethodOrder(OrderAnnotation.class)
class TestOne {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf=Persistence.createEntityManagerFactory("jpa");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em=emf.createEntityManager();
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
	}

	@Test
	@Order(1)
	void test() {
		em.getTransaction().begin();
		
		Invoice invoice=new Invoice();
		invoice.setInvoice_date(LocalDate.now());
		invoice.setStaffName("su su");
		
		Orders order=new Orders();
		order.setOrder_date(LocalDate.now());
		order.setTotalAmt(30000);
		order.setTotalQty(20);
		
		//em.persist(order);because invoice.java have persist
		
		invoice.setOrder(order);
		em.persist(invoice);
		em.getTransaction().commit();
		
	}
	@Test
	@Order(2)
	void test2() {
		Invoice inv =em.find(Invoice.class, 1);
		System.out.println("Order Date is:"+inv.getOrder().getOrder_date());
	}

}
