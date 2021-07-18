package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumber {

	public static void main(String[] args) {
		String mobileNo1 = "8050811032";
		String mobileNo2 = "9743992123";
		String mobileNo3 = "9988765437";
		String mobileNo4 = "8765432976";
		String mobileNo5 = "7353214356";
		String mobileNo6 = "9817942759";
		String mobileNo7 = "1234567899";
		String mobileNo8 = "9876543216";
		String mobileNo9 = "7654324567";
		String mobileNo10 = "9876543234";

		Collection collection = new ArrayList();
		boolean added = false;
		System.out.println(added);
		added = collection.add(mobileNo7);
		added = collection.add(mobileNo3);
		added = collection.add(mobileNo6);
		added = collection.add(mobileNo4);
		added = collection.add(mobileNo2);
		added = collection.add(mobileNo9);
		added = collection.add(mobileNo10);
		added = collection.add(mobileNo5);
		added = collection.add(mobileNo1);
		added = collection.add(mobileNo8);
		System.out.println(added);

		int temp = collection.size();
		System.out.println(temp);

		String check = "00000000";
		boolean contain = collection.contains(check);
		System.out.println("contain" + contain);

		boolean removed = collection.remove("8050811032");
		System.out.println("removed" + removed);
		collection.add(1996);

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
