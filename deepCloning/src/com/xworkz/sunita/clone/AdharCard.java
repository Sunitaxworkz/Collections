package com.xworkz.sunita.clone;

public class AdharCard implements Cloneable {
public String dob;
public boolean phoneLinked;


public AdharCard(String dob,boolean phoneLinked){
	System.out.println("created constructor");
	this.dob=dob;
	this.phoneLinked=phoneLinked;
}

@Override
public AdharCard clone() throws CloneNotSupportedException{
	System.out.println("implementation");
	return(AdharCard) super.clone();
	
}

public void displayInfo() {
	System.out.println(this.dob);
	System.out.println(this.phoneLinked);
}
}
