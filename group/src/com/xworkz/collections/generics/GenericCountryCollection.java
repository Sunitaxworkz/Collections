package com.xworkz.collections.generics;

import java.util.*;

public class GenericCountryCollection {

	public static void main(String[] args) {

		String india = "India";
		String japan = "Japan";
		String china = "China";
		String germany = "Germany";
		String rashya = "Rashya";
		String france = "France";

		Collection<String> collection = new ArrayList();
		collection.add(france);
		collection.add(india);
		collection.add(germany);
		collection.add(rashya);
		collection.add(china);
		collection.add(japan);

		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			String temp = itr.next();
			System.out.println(temp.toUpperCase());

		}

	}

}
