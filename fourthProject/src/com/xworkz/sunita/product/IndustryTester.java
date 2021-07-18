package com.xworkz.sunita.product;

import com.xworkz.sunita.product.constants.IndustryType;

public class IndustryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Industry ind = new Industry();
		ind.name = "KAJAH";
		ind.type = IndustryType.AGRICULTURE;
		ind.noOfEmps = 500;
		ind.displayInfo();

		System.out.println("clone event");
		try {
			Industry industry1 = ind.clone();
			System.out.println(industry1.name);
			System.out.println(industry1.type);
			System.out.println(industry1.noOfEmps);
			industry1.displayInfo();

		} 
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
