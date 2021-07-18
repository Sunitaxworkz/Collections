package com.xworkz.collections.generics;

import java.util.*;

public class GenericEmployeeIdCollection {

	public static void main(String[] args) {

		String EmpId1 = "SNM1207";
		String EmpId2 = "SRK2502";
		String EmpId3 = "XYZ789";
		String EmpId4 = "IOP0987";
		String EmpId5 = "JHUY4536";

		Collection<String> collection = new ArrayList<String>();
		collection.add(EmpId5);
		collection.add(EmpId4);
		collection.add(EmpId3);
		collection.add(EmpId2);
		collection.add(EmpId1);

		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			String temp = itr.next();
			System.out.println(temp);

		}

	}
}
