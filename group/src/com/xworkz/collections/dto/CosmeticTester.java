package com.xworkz.collections.dto;

import java.util.*;

public class CosmeticTester {

	public static void main(String[] args) {
		CosmeticsDTO cos = new CosmeticsDTO("Mascara", "Soultree", 950D, "India", 6, true, true, true);

		CosmeticsDTO cos1 = new CosmeticsDTO("Foundation", "Lakme", 660D, "xyz", 5, true, true, true);

		CosmeticsDTO cos2 = new CosmeticsDTO("nailpolish", "DeBelle", 275D, "India", 7, true, false, true);

		Collection<CosmeticsDTO> collection = new ArrayList<CosmeticsDTO>();
		collection.add(cos);
		collection.add(cos1);
		collection.add(cos2);

		Iterator<CosmeticsDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			CosmeticsDTO ref = itr.next();
			System.out.println(ref);
			if (ref.getPrice() != null && ref.getPrice() > 100) {
				System.out.println("Cosmetics price is high");
			}

		}

		CosmeticsDTO cosm = new CosmeticsDTO("MASCARA", "SOULTREE", 950D, "India", 6, true, true, true);
		boolean contain = collection.contains(cosm);
		System.out.println(contain);

	}

}
