package com.xworkz.relieve.rules;

public class ExternalAffairs {
	private PassportRule rule;

	public ExternalAffairs() {
		System.out.println("ExternalAffairs frame created");
	}

	public void passportVerification() {
		if (rule != null) {
			System.out.println("verification started");
			boolean match = this.rule.detailsMatch();
			boolean citizen = this.rule.indianCitizen();
			boolean cas = this.rule.criminalCase();
			if (match == true && citizen==true && cas==true) {
				System.out.println("verification is done");
			} else {
				System.out.println("verification is not done");
			}
		} else {
			System.out.println("verification failed");
		}
	}

	public void setRule(PassportRule rule) {
		this.rule = rule;
	}
}