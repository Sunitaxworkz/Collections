package com.xworkz.collections.set.tester;



import java.util.Collection;

import com.xworkz.collections.set.KitchenItemDTO;
import com.xworkz.collections.set.dao.KitchenItemDAO;
import com.xworkz.collections.set.dao.KitchenItemDAOImpl;

public class KitchenItemDTOTester {

	public static void main(String[] args) {
		KitchenItemDTO item1 = new KitchenItemDTO("HandBlender", 99, "Blending", "Silver");
		KitchenItemDTO item2 = new KitchenItemDTO("Chopper", 249, "Cutting", "plastic");
		KitchenItemDTO item3 = new KitchenItemDTO("GlassJar", 700, "Storing", "Glass");
		
		KitchenItemDAO dao = new KitchenItemDAOImpl();
		dao.saveUnique(item1);
		dao.saveUnique(item3);
		dao.saveUnique(item2);
		
		Collection<KitchenItemDTO> collection=dao.findAllSortByUsedFor();
		for (KitchenItemDTO kitchen : collection) {
			System.out.println(kitchen);
		}
		

		Collection<KitchenItemDTO> collection1=dao.findAllSortByName();
		for (KitchenItemDTO kitchen : collection1) {
			System.out.println(kitchen);
		}
		Collection<KitchenItemDTO> coll=dao.findAllSortByPrice();
		for (KitchenItemDTO kitchen : coll) {
			System.out.println(kitchen);
		}
	}

}
