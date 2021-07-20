package com.xworkz.sunita.product;

public class LanguageTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Language lang = new Language();
		lang.name = "KANNADA";
		lang.region = "Karnataka";
		lang.old = 50;
		lang.displayInfo();

		Language lan=new Language();
		lan.name="TELUGU";
		lan.region="ANDRAPRADESH";
		lan.old=40;
		lan.displayInfo();
	}

}
