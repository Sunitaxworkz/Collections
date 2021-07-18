package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Actor {

	public static void main(String[] args) {
		String actor1 = "VISHNUVARDHAN";
		String actor2 = "SUDEEP";
		String actor3 = "DARSHAN";
		String actor4 = "GANESH";
		String actor5 = "RAKSHIT SHETTY";
		String actor6 = "SUSHANTH";
		String actor7 = "YASH";
		String actor8 = "PUNEET";
		String actor9 = "DIGANTH";
		String actor10 = "RAVICHANDRAN";

		Collection collection = new ArrayList();
		boolean added = false;
		added = collection.add(actor1);
		added = collection.add(actor4);
		added = collection.add(actor7);
		added = collection.add(actor3);
		added = collection.add(actor5);
		added = collection.add(actor2);
		added = collection.add(actor7);
		added = collection.add(actor6);
		added = collection.add(actor8);
		added = collection.add(actor10);
		System.out.println(added);

		int temp = collection.size();
		System.out.println(temp);

		String check = "SUDEEP";
		boolean contain = collection.contains(check);
		System.out.println("contain" + contain);

		boolean removed = collection.remove("Dr Raj Kumar");
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

	}

}
