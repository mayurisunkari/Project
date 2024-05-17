package com.java.cars6.main;
import com.java.cars6.dao.IncidentsDaoImpl;
import com.java.cars6.model.Incidents;
import java.sql.SQLException;
import java.util.List;

import com.java.cars6.dao.IncidentsDao;

public class GenerateIncidentsReportMain {
public static void main(String[] args) {
		
		IncidentsDao dao=new IncidentsDaoImpl();
		  try {
			List<Incidents> IncidentList =  dao.GenerateIncidentsReport();
			for (Incidents incidents : IncidentList) {
				System.out.println(incidents);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
