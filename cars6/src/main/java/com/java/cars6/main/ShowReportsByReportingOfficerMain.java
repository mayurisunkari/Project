package com.java.cars6.main;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.cars6.dao.ReportsDao;
import com.java.cars6.dao.ReportsDaoImpl;
import com.java.cars6.model.Reports;
public class ShowReportsByReportingOfficerMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ReportingOfficer");
		
		int ReportingOfficer=sc.nextInt();
		ReportsDao dao=new ReportsDaoImpl();
		try {
			
			List<Reports> reportList=dao.ShowReportsByReportingOfficer(ReportingOfficer);
			if(reportList.isEmpty()) {
				System.out.println("ReportingOfficer Not Found");
			}
			else {
				for (Reports reports : reportList) {
					System.out.println(reports);
					
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
