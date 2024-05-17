package com.java.cars6.model;

import java.sql.Date;

public class Test {
	public static void main(String[] args) {
		
		 Victims victim = new Victims(1, "Jane", "Doe", Date.valueOf("1990-01-01"),"FEMALE", "9876543210", "123 Main St");
		 System.out.println(victim.toString());
	}

}
