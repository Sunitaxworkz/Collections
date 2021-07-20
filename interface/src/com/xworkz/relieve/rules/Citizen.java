package com.xworkz.relieve.rules;

public class Citizen implements PassportRule {
	private String name;
	private long mobileNo;

	public Citizen(String name, long mobileNo) {
		this.name = name;
		this.mobileNo = mobileNo;
	}

	@Override
	public boolean detailsMatch() {
		System.out.println(this.name +  this.mobileNo +  "Details matched");
		return true;
	}

	@Override
	public boolean indianCitizen() {
		System.out.println(this.name +  this.mobileNo + "IndianCitizen");
		return true;
	}

	@Override
	public boolean criminalCase() {
		System.out.println(this.name +  this.mobileNo + "No criminal Case");
		return true;
	}

}
