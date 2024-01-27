package com.hexaware.casestudy.entity;

public class Admininstrator {
	private int cartId;
		private double price;
		private int qty;
		private double total;
		                        
		private MenuItems menuId;                            //fk
		private Restaurants restaurantID;                      //FK
		private Orders orderID;                          //FK
		private Customers customerID;                       //FK
	
}

