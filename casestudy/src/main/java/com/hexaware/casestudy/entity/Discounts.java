package com.hexaware.casestudy.entity;

import java.time.LocalDate;

public class Discounts {

	
	
	private LocalDate paymentDate;
	private double amount;
	private String paymentMethod;
	private String transactionID;
	
	private Orders orderID;                                //fk
	private Customers CustomerID;                                 //fk
	private Payments paymentID;                         //fk
}
