package com.hexaware.casestudy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {

	@Id
	private int cartId;
	private double price;
	private int qty;
	private double total;
	                        
	 @OneToOne
	    @JoinColumn(name = "custid")
	    private Customers customer;


	 @OneToMany(mappedBy = "cart")
	    private Set<MenuItems> menuItemSet =  new HashSet<MenuItems>();;

	    @OneToMany(mappedBy = "cart")
	    private Set<Orders> orderSet = new HashSet<Orders>();
	    
	    @OneToMany(mappedBy = "cart")
	    private Set<Payments> paymentSet = new HashSet<Payments>();                    //FK

}
