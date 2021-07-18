package com.xworkz.collections.list.dto;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class StreetDTOTester {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			StreetDTO street = new StreetDTO("RajajiNagar", 568997, "Navarang Theater", "Bangalore");
			StreetDTO street1 = new StreetDTO("OuterRoad", 560096, "Vinayaka Temple", "Bangalore");
			StreetDTO street2 = new StreetDTO("Anagol", 566096, "KLE college", "Belagavi");

			List<StreetDTO> list = new ArrayList<StreetDTO>();
			list.add(street);
			list.add(street1);
			list.add(street2);

			System.out.println("list size:" + list.size());// size

			System.out.println("before set:" + list.get(1));
			list.set(1, street1);

			ListIterator<StreetDTO> iterator = list.listIterator();
			while (iterator.hasNext()) {// hasNext()
				StreetDTO temp = iterator.next();// next()
				System.out.println(temp);
			}

			StreetDTO value = new StreetDTO("OuterRoad", 560096, "Vinayaka Temple", "Bangalore");
			boolean contain = list.contains(value);
			System.out.println("contain:" + contain);
			System.out.println("contain all element:" + list.containsAll(list));

			System.out.println("size before remove:" + list.size());// size
			System.out.println("removed element:" + list.remove(street1));
			System.out.println("size after removed:" + list.size());// size

			System.out.println("before set:" + list.get(1));
			StreetDTO anotherStreet = new StreetDTO("MG", 500876, "Lakshmi garments", "Bangalore");
			list.set(1, anotherStreet);
			System.out.println("after set:" + list.get(1));
			System.out.println("removed element:" + list.removeAll(list));

		}

	

	}


