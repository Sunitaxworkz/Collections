package com.xworkz.collections.dto;

import com.xworkz.collections.dto.constants.*;
import java.util.*;

public class OilDTOTester {

	public static void main(String[] args) {

		OilDTO dto1 = new OilDTO("Rey Naturals", 864D, OilType.CASTOR, OilColor.GOLD, true, false, true, 87D);

		OilDTO dto2 = new OilDTO("Ajara", 950D, OilType.COCONUT, OilColor.WHITE, true, false, true, 98D);

		OilDTO dto3 = new OilDTO("DEYGO", 600D, OilType.ALMOND, OilColor.GOLD, true, false, true, 90D);

		Collection<OilDTO> collection = new ArrayList<OilDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);

		Iterator<OilDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			OilDTO ref = itr.next();
			System.out.println(ref);
			if (ref.getPrice() != null && ref.getPrice() > 100) {
				System.out.println("Oil price is high");
			}

		}
		OilDTO dto4 = new OilDTO("DEYGO", 600D, OilType.ALMOND, OilColor.GOLD, true, false, true, 90D);
		boolean contain = collection.contains(dto4);
		System.out.println(contain);
	}

}
