package com.xworkz.sunita.application;

public class Application implements Cloneable {
	public String name;
	public double version;
	public String[] developers;

	@Override
	public Application clone() throws CloneNotSupportedException {
		System.out.println("implementation of clone");
		return (Application) super.clone();
	}

	void displayInfo() {
		System.out.println(this.name);
		System.out.println(this.version);
		if (this.developers != null) {
			for (int i = 0; i < developers.length; i++) {
				System.out.println(this.developers[i]);
			}
		}
	}
}
