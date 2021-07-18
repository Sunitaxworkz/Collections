package com.xworkz.sunita.product;

import com.xworkz.sunita.product.constants.IndustryType;

public class Industry implements Cloneable {
	public String name;
	public IndustryType type;
	public int noOfEmps;

	@Override
	public Industry clone() throws CloneNotSupportedException {
		System.out.println("Implementation for cloning");
		return (Industry) super.clone();
	}

	public void displayInfo() {
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.noOfEmps);

	}

}
