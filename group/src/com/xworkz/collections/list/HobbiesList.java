package com.xworkz.collections.list;

import java.util.*;

public class HobbiesList {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<String> hobbies = new ArrayList<String>();
			hobbies.add("Crafting");
			hobbies.add("Dancing");
			hobbies.add("Singing");
			hobbies.add("Reading");
			hobbies.add("Painting");
			hobbies.add("Drawing");
			hobbies.add("Stiching");
			

			Collections.sort(hobbies);// sort()method
			for (int i = 0; i < hobbies.size(); i++) {
				System.out.println("sorted lists:" + hobbies.get(i));
			}

			System.out.println("before adding:" + hobbies.get(4));// to print 4th index element

			hobbies.add(4, "Cooking");// add()
			System.out.println("after adding:" + hobbies.get(4));// get()

			System.out.println("hobbies size:" + hobbies.size());// size()

			ListIterator<String> iterator = hobbies.listIterator(6);// listiterator()
			System.out.println("iterator index" + iterator.nextIndex());// nextIndex()

			while (iterator.hasPrevious()) {// hasPrevious()
				String temp = iterator.previous();// previous
				System.out.println("backward hobbies:" + temp);
			}

			System.out.println("calling hasnext  and next method");
			while (iterator.hasNext()) { // has next
				String temp1 = iterator.next();// next
				System.out.println("forward hobbies:" + temp1);
			}
			int indexOfDancing = hobbies.indexOf("Dancing");// indexof(element)
			System.out.println("indexOfVenus:" + indexOfDancing);

			System.out.println("to array elements:" + hobbies.toArray());// toArray

			System.out.println("before set:" + hobbies.get(2));

			hobbies.set(2, "Reading");// set(index ,element)
			System.out.println("after set:" + hobbies.get(2));//to replace the element

			System.out.println("remove element of Dancing:" + hobbies.remove("Dancing"));// remove(element)

			System.out.println("remove element at index(3):" + hobbies.remove(3));// (remove index)
			System.out.println("contained element:" + hobbies.contains("Stiching"));// contains(element)
			System.out.println("sublist:" + hobbies.subList(0, 3));// sublist(-from index,to index) 0-from 3to

		}

	}
