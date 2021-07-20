package com.xworkz.sunita.clone;

import com.xworkz.sunita.clone.Gender;

public class Person implements Cloneable {
	public String name;
	public Gender gender;
	public AdharCard adharCard;// represents association

	public Person(String name, Gender gender, AdharCard adharCard) {
		System.out.println("Person constructor");
		this.name = name;
		this.gender = gender;
		this.adharCard = adharCard;
	}

	@Override
	public Person clone() throws CloneNotSupportedException {
		System.out.println("default implementation for cloning");
		Person person = (Person) super.clone();// casting(shallow cloning)
		if (adharCard != null) {
			person.adharCard = adharCard.clone();// deep cloning
		}
		return person;
	}

	public void displayInfo() {
		System.out.println(this.name);
		System.out.println(this.gender);
		this.adharCard.displayInfo();
	}
}
