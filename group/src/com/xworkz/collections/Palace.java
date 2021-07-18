package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Palace {

	public static void main(String[] args) {
		String palace1 = "Mysore Palace";
		String palace2 = "Umaid Bhawan Palace";
		String palace3 = "Mundota Palace";
		String palace4 = "Taj lake Palace";
		String palace5 = "Banglore Palace";
		String palace6 = "Lalita Mahal Palace";
		String palace7 = "Lotus Palace";
		String palace8 = "JaganMohan Palace";
		String palace9 = "Raaj Mahal Palace";
		String palace10 = "City Palace";

		Collection collection = new ArrayList();
		boolean added = false;
		added = collection.add(palace1);
		added = collection.add(palace4);
		added = collection.add(palace7);
		added = collection.add(palace3);
		added = collection.add(palace5);
		added = collection.add(palace2);
		added = collection.add(palace7);
		added = collection.add(palace6);
		added = collection.add(palace8);
		added = collection.add(palace10);
		System.out.println(added);

		int temp = collection.size();
		System.out.println(temp);

		String check = "Mysore Palace";
		boolean contain = collection.contains(check);
		System.out.println("contain" + contain);

		boolean removed = collection.remove("Chilli Powder");
		System.out.println("removed" + removed);

		Iterator iterator = collection.iterator();
		iterator.hasNext();// will start to print from index[0]
		Object obj = iterator.next();// returns the value
		System.out.println(obj);

		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();

		Object secret = iterator.next();
		System.out.println("secret" + secret);
		Object secret1 = iterator.next();
		System.out.println("secret1" + secret1);
		Object secret2 = iterator.next();
		System.out.println("secret2" +secret2);
	}

}
