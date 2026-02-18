package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Order {
	private int orderId;
	private String customerName;
	private int quantity;
	@Autowired
	private Product product;
	
	public Order() {
		this.orderId=2006;
		this.customerName="Bharath";
		this.quantity=4;
	}
	public void display() {
		System.out.println("The details of the order.......");
		System.out.println("Orderid:"+orderId);
		System.out.println("CustomerName:"+customerName);
		System.out.println("Quantity:"+quantity);
		System.out.println("ProductId:"+product.getProductId());
		System.out.println("ProductName:"+product.getProductName());
		System.out.println("ProductPrice:"+product.getPrice());
		System.out.println("ProductCategory:"+product.getCategory());
		
		
	}

}
