package com.java.cars6.main;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.java.cars6.dao.ReportsDao;
import com.java.cars6.dao.ReportsDaoImpl;
import com.java.cars6.model.Reports;
public class ShowReportByDateMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reports report=new Reports();

        System.out.print("Enter date (yyyy-MM-dd): ");
		String DateString=sc.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
			java.util.Date date = dateFormat.parse(DateString);
			 java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			  report.setReportDate(sqlDate);
			  
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        ReportsDao dao=new ReportsDaoImpl();
        try {
			List<Reports>reportList=dao.ShowReportByDate(report.getReportDate());
			if(reportList.isEmpty()) {
				System.out.println("invalid ");
			}
			else {
				
			
			for (Reports reports : reportList) {
				System.out.println(reports);
			}}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally {
        	sc.close();
        }
        
    }
}
