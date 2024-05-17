package com.java.cars6.dao;


import java.sql.Date;
import java.sql.SQLException;
import java.util.List;


import com.java.cars6.model.Reports;

public interface ReportsDao {
	 List<Reports>ShowReports() throws ClassNotFoundException, SQLException ;
	 Reports ShowRePortsByID(int ReportID) throws ClassNotFoundException, SQLException;
     List<Reports>ShowReportsByStatus(String Status) throws ClassNotFoundException, SQLException;
     List<Reports>ShowReportsByReportingOfficer(int ReportingOfficer) throws ClassNotFoundException, SQLException;
     List<Reports>ShowReportByDate(Date ReportDate) throws ClassNotFoundException, SQLException;
}