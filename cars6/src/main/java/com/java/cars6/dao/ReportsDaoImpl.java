
package com.java.cars6.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.cars6.model.Reports;
import com.java.cars6.util.DBConnUtil;
import com.java.cars6.util.DBPropertyUtil;

public class ReportsDaoImpl implements ReportsDao{
	
	Connection connection;
	PreparedStatement pst;
	

	@Override
	public List<Reports> ShowReports() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd="select * from Reports";
		pst=connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		List<Reports>reportList=new ArrayList<Reports>();
		
		while(rs.next()) {
			
			Reports report= new Reports();
			report.setReportID(rs.getInt("ReportID"));
			report.setIncidentID(rs.getInt("IncidentID"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setReportingOfficer(rs.getInt("reportingOfficer"));
			report.setStatus(rs.getString("Status"));
			reportList.add(report);
		}
		return reportList;
		
		
		
	}


	@Override
	public Reports ShowRePortsByID(int ReportID) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd="select * from Reports where ReportID=?";
		pst=connection.prepareStatement(cmd);
		Reports report=new Reports();
		pst.setInt(1, ReportID);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			report.setReportID(rs.getInt("ReportID"));
			report.setIncidentID(rs.getInt("IncidentID"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setReportingOfficer(rs.getInt("ReportingOfficer"));
			report.setStatus(rs.getString("Status"));
		}
		return report;
		
	}


	@Override
	public List<Reports> ShowReportsByStatus(String Status) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd="select * from Reports where Status=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, Status);
		Reports report=new Reports();
		ResultSet rs=pst.executeQuery();
        List<Reports>reportList=new ArrayList<Reports>();
		
		while(rs.next()) {
			
			report.setReportID(rs.getInt("ReportID"));
			report.setIncidentID(rs.getInt("IncidentID"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setReportingOfficer(rs.getInt("reportingOfficer"));
			report.setStatus(rs.getString("Status"));
			reportList.add(report);
		}
		return reportList;
		
		
		
	}


	@Override
	public List<Reports> ShowReportsByReportingOfficer(int ReportingOfficer) throws ClassNotFoundException, SQLException {
		
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd="select * from Reports where ReportingOfficer=?";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1, ReportingOfficer);
		
	    ResultSet rs=pst.executeQuery();
        List<Reports>reportList=new ArrayList<Reports>();
        while(rs.next()) {
        	Reports report=new Reports();
			report.setReportID(rs.getInt("ReportID"));
			report.setIncidentID(rs.getInt("IncidentID"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setReportingOfficer(rs.getInt("reportingOfficer"));
			report.setStatus(rs.getString("Status"));
			reportList.add(report);
		}
		return reportList;
		
		
	}


	@Override
	public List<Reports> ShowReportByDate(Date ReportDate) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd="select * from Reports where ReportDate=?";
		pst=connection.prepareStatement(cmd);
		pst.setDate(1, ReportDate);
		
	    ResultSet rs=pst.executeQuery();
        List<Reports>reportList=new ArrayList<Reports>();
        while(rs.next()) {
        	Reports report=new Reports();
			report.setReportID(rs.getInt("ReportID"));
			report.setIncidentID(rs.getInt("IncidentID"));
			report.setReportDate(rs.getDate("ReportDate"));
			report.setReportDetails(rs.getString("ReportDetails"));
			report.setReportingOfficer(rs.getInt("reportingOfficer"));
			report.setStatus(rs.getString("Status"));
			reportList.add(report);
		}
		return reportList;
		
	}
		
	

}
