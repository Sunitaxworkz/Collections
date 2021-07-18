package com.xworkz.collections.generics;

import java.util.*;

public class GenericSalaryCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sal1 = 6000;
		double sal2 = 100;
		double sal3 = 9000;
		double sal4 = 2000;
		double sal5 = 8000;

		Collection<Double> collection = new ArrayList<Double>();
		collection.add(sal1);
		collection.add(sal2);
		collection.add(sal3);
		collection.add(sal4);
		collection.add(sal5);

		Iterator<Double> itr = collection.iterator();
		while (itr.hasNext()) {
			double temp = itr.next();
			System.out.println(temp);

			if (temp > 1000 && temp < 5000) {
				System.out.println("Salary is good");
			} else if (temp <1000) {
				System.out.println("salary is not good");
			} else if (temp >5000) {
				System.out.println("great salary");
			}

		}
	}

}
