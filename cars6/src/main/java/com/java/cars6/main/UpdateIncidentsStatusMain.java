package com.java.cars6.main;

import java.util.Scanner;
import java.sql.SQLException;
import com.java.cars6.model.Incidents;
import com.java.cars6.dao.IncidentsDaoImpl;
import com.java.cars6.dao.IncidentsDao;
public class UpdateIncidentsStatusMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    Incidents incident= new Incidents();
	    System.out.println("enter IncidentID");
	    incident.setIncidentID(sc.nextInt());
	    System.out.println("enter status");
	    incident.setStatus(sc.next());
	    IncidentsDao  dao=new IncidentsDaoImpl();
	    try {
			Boolean Success=dao.UpdateIncidentsStatus(incident.getStatus(), incident.getIncidentID());
			if(Success==true) {
				System.out.println("**data updated succesfully**");
			}
			else {
				System.out.println("**data not updated**");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
	    
	}

}
