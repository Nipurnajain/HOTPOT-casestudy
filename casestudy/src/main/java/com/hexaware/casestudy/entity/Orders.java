package com.hexaware.casestudy.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orders {
	
	@Id
    @Column(name = "OrderID")
    private int orderId;
	
	@Column(name = "OrderDate")
    private Timestamp orderDate;

    @Column(name = "TotalCost", nullable = false)
    private BigDecimal totalCost;

    @Column(name = "Status")
    private String status;
	
	@ManyToOne
    @JoinColumn(name = "CartID")
    private Cart cart;
	
	@ManyToOne
    @JoinColumn(name = "custID")
    private Customers customer;
	
	@ManyToOne
    @JoinColumn(name = "resId")
    private Restaurants restaurant;
	

}
