package com.xworkz.collections.set.dao;

import java.util.Collection;

import com.xworkz.collections.set.KitchenItemDTO;

public interface KitchenItemDAO   {

	boolean saveUnique(KitchenItemDTO dto);

	Collection<KitchenItemDTO> findAllSortByUsedFor();
	
	Collection<KitchenItemDTO> findAllSortByName();

	Collection<KitchenItemDTO> findAllSortByPrice();
	

}
