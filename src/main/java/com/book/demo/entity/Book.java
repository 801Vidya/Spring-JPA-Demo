package com.book.demo.entity;

import jakarta.persistence.*;

@Entity
public class Book {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column
	    private String title;
	    
	    @Column
	    private String author;
	    
	    @Column
	    private double price;

	    // Getters and Setters
	    public Long getId() { 
	    	return id; 
	    	}
	    public void setId(Long id) {
	    	this.id = id; 
	    	}

	    public String getTitle() { 
	    	return title; 
	    	}
	    public void setTitle(String title) { 
	    	this.title = title; 
	    	}

	    public String getAuthor() { 
	    	return author;
	    	}
	    public void setAuthor(String author) { 
	    	this.author = author; }

	    public double getPrice() { 
	    	return price; }
	    
	    public void setPrice(double price) { 
	    	this.price = price; }

}
