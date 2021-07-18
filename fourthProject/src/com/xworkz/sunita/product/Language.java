package com.xworkz.sunita.product;

public class Language implements Cloneable {
	public String name;
	public String region;
	public byte old;

	@Override
	public Language clone() throws CloneNotSupportedException {
		System.out.println("Implementation for cloning");
		return (Language) super.clone();
	}

	public void displayInfo() {
		System.out.println(this.name);
		System.out.println(this.region);
		System.out.println(this.old);

	}
}
