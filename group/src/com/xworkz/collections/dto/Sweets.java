package com.xworkz.collections.dto;

public class Sweets {
	private String name;
	private String color;
	private String region;
	private boolean taste;
	private boolean milkSolidBased;
	private boolean dryFruits;

	public Sweets() {
		System.out.println("defalut constructor of sweets");
	}

	public Sweets(String name, String color, String region, boolean taste, boolean milkSolidBased, boolean dryFruits) {
		super();
		this.name = name;
		this.color = color;
		this.region = region;
		this.taste = taste;
		this.milkSolidBased = milkSolidBased;
		this.dryFruits = dryFruits;
	}

	@Override
	public String toString() {
		return "Sweets [name=" + name + ", color=" + color + ", region=" + region + ", taste=" + taste
				+ ", milkSolidBased=" + milkSolidBased + ", dryFruits=" + dryFruits + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method for Sweets");
		if (obj == null)
			return false;
		if (obj instanceof Sweets) {
			Sweets ref = (Sweets) obj;
			if (this.name.equalsIgnoreCase(ref.getName()) && this.color.equals(ref.getColor())
					&& this.region.equalsIgnoreCase(ref.getRegion())) {
				System.out.println("Sweets is equals:" + this.name);
				return true;
			} else {
				System.out.println("Sweets is not equals:" + this.name);
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public boolean isTaste() {
		return taste;
	}

	public void setTaste(boolean taste) {
		this.taste = taste;
	}

	public boolean isMilkSolidBased() {
		return milkSolidBased;
	}

	public void setMilkSolidBased(boolean milkSolidBased) {
		this.milkSolidBased = milkSolidBased;
	}

	public boolean isDryFruits() {
		return dryFruits;
	}

	public void setDryFruits(boolean dryFruits) {
		this.dryFruits = dryFruits;
	}

}
