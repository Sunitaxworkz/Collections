package com.xworkz.relieve.rules;

public class PassportTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassportRule passportrule = new Citizen("sunita",8050811032l);
		ExternalAffairs affairs=new ExternalAffairs();
		affairs.setRule(passportrule);
		affairs.passportVerification();
		
	}

}
