package com.xworkz.sunita.product;

import com.xworkz.sunita.product.constants.ProductType;

public class Product implements Cloneable {
	public String productId;
	public String name;
	public int price;
	public ProductType type;

	@Override
	public Product clone() throws CloneNotSupportedException { //to handle the exception
		System.out.println("default implementation for cloning");
		return (Product) super.clone();
	}

	public void displayInfo() {
		System.out.println(this.productId);
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.type);
	}
}
