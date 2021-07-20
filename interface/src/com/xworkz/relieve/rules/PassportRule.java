package com.xworkz.relieve.rules;

public interface PassportRule {
	boolean detailsMatch();

	boolean indianCitizen();

	boolean criminalCase();
}