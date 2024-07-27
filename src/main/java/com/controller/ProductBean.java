package com.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.Bean.Product;
import com.model.ProductRemoter;
@ManagedBean(name="product",eager=true)
@RequestScoped
public class ProductBean  {
	private int id;
	private String name;
     private String description;
     private double price;
     private int quantity;
     private String ack;
     
     @EJB(lookup="java:global/cosmic-cart/ProductModel!com.model.ProductRemoter")
     ProductRemoter pr;
     public void callInsert() {
    	 try {
    		Product p = new Product();
    		p.setId(id);
    		p.setName(name);
    		p.setDescription(description);
    		p.setPrice(price);
    		p.setQuantity(quantity);
    		ack=pr.insertData(p);
    		System.out.println("Record inserted ");
    	 }catch(Exception e) {
    		 ack = "Error: " + e.getMessage();
    	 }
     }
     
     
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 public String getAck() {
			return ack;
		}


		public void setAck(String ack) {
			this.ack = ack;
		}
}
