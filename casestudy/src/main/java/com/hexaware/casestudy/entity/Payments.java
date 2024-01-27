package com.hexaware.casestudy.entity;

import java.time.LocalDate;

public class Payments {

	    private int paymentID;
	    private LocalDate paymentDate;
	    private double amount;
	    private String paymentMethod;
	    private String transactionID;
	    
	    private Customers CustomerID;                                     //fk
	    private Orders orderID;                                    //fk
	    
}
