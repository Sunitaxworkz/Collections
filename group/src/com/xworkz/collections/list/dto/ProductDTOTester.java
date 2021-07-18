package com.xworkz.collections.list.dto;

import java.util.*;

public class ProductDTOTester {

	public static void main(String[] args) {
		
		ProductDTO dto1=new ProductDTO("Shampoo","ClinicPlus",150D,340D);
		ProductDTO dto2=new ProductDTO("Watch","Fastrack",1650D,160D);
		ProductDTO dto3=new ProductDTO("Mirror","KushiMirror",250D,120D);
		ProductDTO dto4=new ProductDTO("Chair","Ecolite HangChair",11999D,130D);
		ProductDTO dto5=new ProductDTO("Connector","Portronics",949D,26D);
		
		

		List<ProductDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		
		Collections.sort(list);
		for (ProductDTO ProductDTO : list) {
			System.out.println(ProductDTO);
	
		
	}

}
}