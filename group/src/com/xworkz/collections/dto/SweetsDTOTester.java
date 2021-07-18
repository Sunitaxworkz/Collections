package com.xworkz.collections.dto;

import java.util.*;



public class SweetsDTOTester {

	public static void main(String[] args) {
		Sweets s1 = new Sweets("Gulam Jamun", "DarkBrown", "India", true, true, false);

		Sweets s2 = new Sweets("Shrikhand", "Yellow", "India", true, true, true);

		Sweets s3 = new Sweets("Jalebi", "Orange", "India", true, true, false);

		Collection<Sweets> collection = new ArrayList<Sweets>();
		collection.add(s1);
		collection.add(s2);
		collection.add(s3);
		
		
		Iterator<Sweets> itr = collection.iterator();
		while (itr.hasNext()) {
			Sweets ref = itr.next();
			System.out.println(ref);
			

		}
		Sweets s4 = new Sweets("GULAM JAMUN", "DarkBrown", "India", true, true, false);
		boolean contain = collection.contains(s4);
		System.out.println(contain);
		
		
		}

		

	}


