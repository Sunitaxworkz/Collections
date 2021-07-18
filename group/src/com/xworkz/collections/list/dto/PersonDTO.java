package com.xworkz.collections.list.dto;

import java.io.Serializable;

public class PersonDTO implements Serializable,Comparable<PersonDTO> {
private String name;
private int age;
private String email;


public PersonDTO() {
	System.out.println("default constructor");
}


@Override
public String toString() {
	return "PersonDTO [name=" + name + ", age=" + age + ", email=" + email + "]";
}
@Override
public int  compareTo(PersonDTO other) {
	int ageOfOther=other.getAge();
	if(this.age==ageOfOther)
		return 0;
	if(this.age>ageOfOther)
		return 1;
	if(this.age<ageOfOther)
		return -1;
	return 0;//return to compareTo method
	
}


public PersonDTO(String name, int age, String email) {
	super();
	this.name = name;
	this.age = age;
	this.email = email;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}

}
