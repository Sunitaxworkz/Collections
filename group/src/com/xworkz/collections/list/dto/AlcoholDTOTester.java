package com.xworkz.collections.list.dto;

import java.util.*;

public class AlcoholDTOTester {

	public static void main(String[] args) {
		AlcoholDTO dto = new AlcoholDTO("MCDowells", 600D, false, 750D);
		AlcoholDTO dto1 = new AlcoholDTO("Kingfisher", 150D, false, 650D);
		AlcoholDTO dto2 = new AlcoholDTO("BlackDog", 2400, true, 500D);
		AlcoholDTO dto3 = new AlcoholDTO("Chivas Regal", 400, false, 320D);
	    AlcoholDTO dto4 = new AlcoholDTO("Smirnoff", 140, false, 250D);
	    
	    List<AlcoholDTO> list = new ArrayList<>();
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		
		Collections.sort(list);
		
		for(AlcoholDTO alcohol: list) {
			System.out.println(alcohol);
			System.out.println(alcohol.getBrand());
		}
		
	}

}
