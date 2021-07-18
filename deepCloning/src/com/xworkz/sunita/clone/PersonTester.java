package com.xworkz.sunita.clone;
import com.xworkz.sunita.clone.Gender;
public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdharCard adharCard=new AdharCard("23/5/89",true);
		Person person=new Person("sunita",Gender.FEMALE,adharCard);

		try {
			System.out.println("cloning started");
			Person person1= person.clone();
			person1.displayInfo();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		
	}

}
}
