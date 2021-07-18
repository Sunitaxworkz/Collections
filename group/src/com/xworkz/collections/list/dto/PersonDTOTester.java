package com.xworkz.collections.list.dto;

import java.util.*;

public class PersonDTOTester {

	public static void main(String[] args) {
		PersonDTO dto = new PersonDTO("Sunita", 24, "sunitameti25@gmail.com");
		PersonDTO dto1 = new PersonDTO("Harshita", 21, "harshitaK@gmail.com");
		PersonDTO dto2 = new PersonDTO("Ranjitha", 10, "ranjitham@gmail.com");
		PersonDTO dto3 = new PersonDTO("Pavitra", 18, "pavitra123@gmail.com");
		PersonDTO dto4 = new PersonDTO("Girija", 22, "girijaJ@gmail.com");

		List<PersonDTO> list = new ArrayList<>();
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);

		Collections.sort(list);
		for (PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
	}

}
