package com.xworkz.datastore.tester;

import java.util.Collection;

import com.xworkz.datastore.dao.TempleDAO;
import com.xworkz.datastore.dao.TempleDAOImpl;
import com.xworkz.datastore.dto.TempleDTO;

public class TempleTester {

	public static void main(String[] args) {
		TempleDTO temple1 = new TempleDTO(1, "Badrinath Temple", "Chamoli", 50, "Payasa", 7, true, "srinivasa",
			false);
		TempleDTO temple2 = new TempleDTO(2, "Nuggikeri Temple", "Dharwad", 20, "Puliyogare", 3, true, "Anjaneya", true);
		TempleDTO temple3 = new TempleDTO(3, "Tirupati", "AndraPradesh", 200, "Laddu", 6, true,"Shrinivasa", true);
		TempleDTO temple4 = new TempleDTO(4, "Vinayak Temple", "Belagavi", 30, "Payasa", 5, false, "Ganesha",false);
		TempleDTO temple5 = new TempleDTO(5, "Annaporneshwari", "Horanadu", 150, "Payasa", 4, false, "Annaporneshwari",
				false);

		TempleDAO dao = new TempleDAOImpl();
		dao.save(temple1);
		dao.save(temple2);
		dao.save(temple3);
		dao.save(temple4);
		dao.save(temple5);

		System.out.println("total size:" + dao.totalItems());

		TempleDTO removetemple5 = new TempleDTO(2, "Nuggikeri Temple", "Dharwad", 20, "Puliyogare", 3, true, "Anjaneya", true);
		dao.delete(removetemple5);
		System.out.println("total size:" + dao.totalItems());

		TempleDTO temp = dao.findFirstItem();
		System.out.println(temp);
		dao.findLastItem();

		dao.findByname("Tirupati");
		dao.findBylocation("AndraPradesh");
		dao.findByLocationAndName("Shrinivasa", "AndraPradesh");

		Collection<TempleDTO> alldata = dao.findAll();
		for (TempleDTO templeDTO : alldata)
			System.out.println(templeDTO);

		Collection<TempleDTO> loc = dao.findAllTempleByLocationStartsWith('N');
		for (TempleDTO templeDTO : loc) {
			System.out.println(templeDTO);
		}
		Collection<TempleDTO> fee = dao.findAllTempleByEntryFeeGreaterThan(50);
		for (TempleDTO templeDTO : fee) {
			System.out.println(templeDTO);
		}
		Collection<TempleDTO> poojaries = dao.findAllTempleByNoOfPoojariesGreaterThan(3);
		for (TempleDTO templeDTO : poojaries)
			System.out.println(templeDTO);
		String var = dao.findLocationByName("Vinayak Temple");
		System.out.println(var);// to check whether it is returning value or not
		Collection<String> location = dao.findAllLocations();
		for (String value : location) {
			System.out.println(value);
		}

	}

}
