package com.java.cars6.main;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import com.java.cars6.dao.*;

import com.java.cars6.model.Incidents;

public class GetIncidentsInDateRangeMain {
	
public static void main(String[] args) {
	 Date startDate = null;
     Date endDate = null;
	
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter startDate (yyyy-MM-dd): ");
	String DateString1=sc.next();
	System.out.print("Enter endDate (yyyy-MM-dd): ");
	String DateString2=sc.next();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	 try {
			java.util.Date date1 = dateFormat.parse(DateString1);
			java.util.Date date2 = dateFormat.parse(DateString2);
			  startDate = new java.sql.Date(date1.getTime());
              endDate = new java.sql.Date(date2.getTime());
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 IncidentsDao dao=new IncidentsDaoImpl();
	 try {
		List<Incidents>incidentList=dao.GetIncidentsInDateRange(startDate, endDate);
		if(incidentList.isEmpty()) {
			System.out.println("No specified dates");
		}
		else {
			
		
		for (Incidents incidents : incidentList) {
			System.out.println(incidents);
			
		}
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 finally {
		 sc.close();
	 }
	 
	
	
	
}

}
