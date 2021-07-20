package com.xworkz.sunita.application;

public class ApplicationTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app=new Application();
		app.name="LinkedIn";
		app.version=8.4;
		
		String[]  developers=new String[4];
		developers[0]="SUNITA";
		developers[1]="RANJITHA";
		developers[2]="UMESH";
		developers[3]="HARSHITA";
		app.developers=developers;
		app.displayInfo();
		
		System.out.println("Clone event");
		try {
			Application app1=app.clone();
			System.out.println(app1.name);
			System.out.println(app1.version);
			app1.displayInfo();
			
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
