package com.hexaware.casestudy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MenuItems {
	

	    @Id
	    private Long id;

	    private String itemName;

	    private String description;

	    private String category;

	    private Double price;

	    private String availabilityTime;

	    private String specialDietaryInfo;

	    private String tasteInfo;

	    private String nutritionalInfo;

	    private Integer cookingTime;

	    
	    @ManyToOne
	    @JoinColumn(name = "RestaurantID")
	    private Restaurants restaurant;
	    
	    @OneToMany(mappedBy = "menuItem")
	    private Set<OrderDetails> orderDetailsSet = new HashSet<OrderDetails>();
	    
		@ManyToOne
	    @JoinColumn(name = "CartID")
	    private Cart cart;



}