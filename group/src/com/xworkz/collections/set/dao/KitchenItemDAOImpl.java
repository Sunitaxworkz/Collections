package com.xworkz.collections.set.dao;

import java.util.*;

import com.xworkz.collections.set.KitchenItemDTO;
import com.xworkz.collections.set.tester.KitchenItemNameComparator;
import com.xworkz.collections.set.tester.KitchenItemPriceComparator;
import com.xworkz.collections.set.tester.KitchenItemUsedForComparator;

public class KitchenItemDAOImpl implements KitchenItemDAO {

	Set<KitchenItemDTO> set = new HashSet<KitchenItemDTO>();

	@Override
	public boolean saveUnique(KitchenItemDTO dto) {
		boolean added = this.set.add(dto);
		System.out.println(dto);
		System.out.println(added);
		return false;

	}

	@Override
	public Collection<KitchenItemDTO> findAllSortByUsedFor() {
		List<KitchenItemDTO> list = new ArrayList<KitchenItemDTO>(this.set);
		KitchenItemUsedForComparator comp = new KitchenItemUsedForComparator();
		Collections.sort(list,comp.reversed());
		return list;
	}
	@Override
	public Collection<KitchenItemDTO> findAllSortByName() {
		List<KitchenItemDTO> list = new ArrayList<KitchenItemDTO>(this.set);
		KitchenItemNameComparator comp = new KitchenItemNameComparator();
		Collections.sort(list,comp);
		return list;
	}
		
		@Override
		public Collection<KitchenItemDTO> findAllSortByPrice() {
			List<KitchenItemDTO> list = new ArrayList<KitchenItemDTO>(this.set);
			KitchenItemPriceComparator comp = new KitchenItemPriceComparator();
			Collections.sort(list, comp.reversed());
			return list;
	}
}
