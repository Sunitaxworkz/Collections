package com.xworkz.collections.list.dto;

import java.io.Serializable;

public class AlcoholDTO implements Serializable,Comparable<AlcoholDTO> {
	private String brand;
	private double price;
	private boolean scotch;
	private double quantity;

	public AlcoholDTO() {
		System.out.println("default constructor");
	}

	@Override
	public String toString() {
		return "AlcoholDTO [brand=" + brand + ", price=" + price + ", scotch=" + scotch + ", quantity=" + quantity
				+ "]";
	}
	
	@Override
	public int compareTo(AlcoholDTO temp) {
	String brandRef=temp.getBrand();
	if(this.brand.compareTo(brandRef)==0)
	return 0;
	if(this.brand.compareTo(brandRef)>0)
	return 1;
	if (this.brand.compareTo(brandRef)<0)
	return -1;
	return 0;
	}
		

	public AlcoholDTO(String brand, double price, boolean scotch, double quantity) {
		super();
		this.brand = brand;
		this.price = price;
		this.scotch = scotch;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isScotch() {
		return scotch;
	}

	public void setScotch(boolean scotch) {
		this.scotch = scotch;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}
