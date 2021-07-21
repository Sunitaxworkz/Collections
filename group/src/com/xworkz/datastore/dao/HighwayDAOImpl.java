package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import com.xworkz.datastore.dto.HighwayDTO;
import com.xworkz.datastore.dto.constants.HighwayType;

public class HighwayDAOImpl implements HighwayDAO {
	List<HighwayDTO> list = new ArrayList<HighwayDTO>();

	@Override
	public boolean save(HighwayDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto " + dto);
		System.out.println("dto added " + added);
		return added;
	}

	@Override
	public Collection<HighwayDTO> findAll() {
		return this.list;
	}

	@Override
	public Collection<Integer> findAllNumber() {
		Collection<Integer> tempCollection = new ArrayList<>();
		Iterator<HighwayDTO> highway = this.list.iterator();
		while (highway.hasNext()) {
			HighwayDTO temp = highway.next();
			System.out.println("findAll number " + temp.getNumber());
			tempCollection.add(temp.getNumber());
		}
		return tempCollection;
	}

	@Override
	public int totalItems() {
		int total = list.size();
		return total;
	}

	
	@Override
	public Collection<HighwayDTO> findByHighwayType(HighwayType type) {
		Collection<HighwayDTO> tempCollection = new ArrayList<>();
		Iterator<HighwayDTO> highway = this.list.iterator();
		while (highway.hasNext()) {
			HighwayDTO temp = highway.next();
			if (temp.getType().equals(type)) {
				System.out.println("find HighwayType " + temp.getType());
			}
		}
		return tempCollection;
	}

	@Override
	public Collection<HighwayDTO> findByStateName(String sname) {
		Collection<HighwayDTO> collection = new ArrayList<HighwayDTO>();
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO dt = itr.next();
			if (dt.getStateName().equals(sname)) {
				System.out.println("find number by state name : " + dt);
				collection.add(dt);
			}
		}
		return collection;
	}

	@Override
	public Collection<HighwayDTO> findNumberByStateName(String sname) {
		Collection<HighwayDTO> collection = new ArrayList<>();
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO number = itr.next();
			if (number.getStateName().equals(sname)) {
				System.out.println("find number by state name : " + number);
				collection.add(number);
			}
		}
		return collection;
	}

	@Override
	public boolean exist(HighwayDTO dto) {
		boolean contain = this.list.contains(dto);
		System.out.println("contains : " + contain);
		return contain;
	}

	@Override
	public boolean isCondition(int number) {
		Iterator<HighwayDTO> itr = this.list.iterator();
		boolean condition = false;
		while (itr.hasNext()) {
			HighwayDTO no = itr.next();
			if (no.getNumber() == (number)) {
				System.out.println("condition : " + no.isCondition());

			}
		}
		return condition;
	}

	@Override
	public double findLengthByNumber(int no) {
		Iterator<HighwayDTO> iterator = this.list.iterator();
		double len = 0;
		while (iterator.hasNext()) {
			HighwayDTO length = iterator.next();
			if (length.getNumber() == (no)) {
				len = length.getLength();
			}

		}
		return len;
	}

	@Override
	public HighwayDTO findByMaxLength() {
		HighwayDTO nick = null;
		nick = Collections.max(list);
		System.out.println("max length : " + nick);

		return nick;
	}

	@Override
	public HighwayDTO findByMinLength() {
		HighwayDTO min = null;
		min = Collections.min(list);
		System.out.println("min length : " + min);
		return min;
	}

}
