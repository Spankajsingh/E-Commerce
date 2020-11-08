package com.Ecommerce.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	int price;
	String description;
	int quantity;
	String imageURL;
	@ManyToOne
	Category category;
	@ManyToOne
	Order order;
	
	  @ManyToOne Cart cart;
	 
	

}
