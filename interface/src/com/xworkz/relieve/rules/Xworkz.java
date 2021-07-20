package com.xworkz.relieve.rules;

public class Xworkz {
	private RelieveRule rule;

	public Xworkz() {
		System.out.println("created Xworkz");
	}

	public void employeeExit() {
		if (rule != null) {
			System.out.println("rules exist can check and exit");
			boolean complete = this.rule.completedBond();
			int period = this.rule.servedNoticePeriod();
			if (complete && period >= RelieveRule.NOTICE_PERIOD_DAYS) {
				System.out.println("emplyoee can exit now");
			} else {
				System.out.println("emplyooee cannot exit,rules not there");
			}
		} else {
			System.out.println("rules not exist,cannot exit");
		}
	}

	public void setRule(RelieveRule rule) {
		this.rule = rule;
	}
}
