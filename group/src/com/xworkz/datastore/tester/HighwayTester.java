package com.xworkz.datastore.tester;

import com.xworkz.datastore.dao.HighwayDAO;
import com.xworkz.datastore.dao.HighwayDAOImpl;
import com.xworkz.datastore.dto.HighwayDTO;
import com.xworkz.datastore.dto.constants.HighwayType;
import java.util.*;

public class HighwayTester {

	public static void main(String[] args) {
		HighwayDTO highway1 = new HighwayDTO("NH07", 7, HighwayType.NATIONAL, "UTTARAKHAND", 845d, true, "NHIDCL");
		HighwayDTO highway2 = new HighwayDTO("NH48", 48, HighwayType.NATIONAL, "DELHI", 2807d, true, "NHIDCL");
		HighwayDTO highway3 = new HighwayDTO("SH1", 189, HighwayType.STATE, "UDUPI", 457d, true, "SPDWD");
		HighwayDTO highway4 = new HighwayDTO("SH12", 250, HighwayType.STATE, "KARNATAKA", 179d, true, "SPDWD");

		HighwayDAO dao = new HighwayDAOImpl();
		dao.save(highway1);
		dao.save(highway2);
		dao.save(highway3);
		dao.save(highway4);

		System.out.println(dao.totalItems());

		
		Collection<HighwayDTO> all = dao.findAll();
		for (HighwayDTO highwayDTO : all) {
			System.out.println(highwayDTO);
		}

		
		Collection<Integer> allNum = dao.findAllNumber();
		for (int number : allNum) {
			System.out.println(number);
		}

		
		Collection<HighwayDTO> highwayType=dao.findByHighwayType(HighwayType.NATIONAL);
		System.out.println("HighwayType:"+ highwayType);

		
		Collection<HighwayDTO> numberbystatename = dao.findNumberByStateName("Karnataka");
		for (HighwayDTO highway : numberbystatename) {
			System.out.println(highway);
		}

	
		Collection<HighwayDTO> bystatename = dao.findByStateName("DELHI");
		for (HighwayDTO dto : bystatename) {
			System.out.println(dto);
		}

		boolean contain = dao.exist(highway1);
		System.out.println("found : " + contain);


		boolean condition = dao.isCondition(20);
		System.out.println("Highway condition : " + condition);

		
		double len = dao.findLengthByNumber(189);
		System.out.println("findbylength : " + len);

		
		HighwayDTO max = dao.findByMaxLength();
		System.out.println("max length : " + max);

		
		HighwayDTO min = dao.findByMinLength();
		System.out.println("min length : " + min);

	}

}