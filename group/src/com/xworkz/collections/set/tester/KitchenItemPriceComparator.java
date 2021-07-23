package com.xworkz.collections.set.tester;

import java.util.Comparator;

import com.xworkz.collections.set.KitchenItemDTO;

public class KitchenItemPriceComparator implements Comparator<KitchenItemDTO> {
	@Override
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
		Double d1=o1.getPrice();
		Double d2=o2.getPrice();
		
		return d1.compareTo(d2);
		
	}
}
