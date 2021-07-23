package com.xworkz.collections.set.tester;

import java.util.Comparator;

import com.xworkz.collections.set.KitchenItemDTO;

public class KitchenItemNameComparator implements Comparator<KitchenItemDTO> {

	@Override
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {

		return o1.getName().compareTo(o2.getName());
	}

}
