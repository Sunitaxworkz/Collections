package com.xworkz.collections.set;

public class KitchenItemDTO {
	private String name;
	private double price;
	private String usedFor;
	private String madeOf;

	public KitchenItemDTO(String name, double price, String usedFor, String madeOf) {
		super();
		this.name = name;
		this.price = price;
		this.usedFor = usedFor;
		this.madeOf = madeOf;
	}



	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof KitchenItemDTO) {
			KitchenItemDTO otherDto = (KitchenItemDTO) obj;
		}
		return true;

	}

	@Override
	public String toString() {
		return "KitchenItemDTO [name=" + name + ", price=" + price + ", usedFor=" + usedFor + ", madeOf=" + madeOf
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public String getMadeOf() {
		return madeOf;
	}

	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}

}
