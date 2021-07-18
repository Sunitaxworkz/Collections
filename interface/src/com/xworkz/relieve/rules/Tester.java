package com.xworkz.relieve.rules;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RelieveRule relieveRule = new Developer("sunita");
		Xworkz xworkz = new Xworkz();
		xworkz.setRule(relieveRule);// null,ref
		xworkz.employeeExit();

	}

}
