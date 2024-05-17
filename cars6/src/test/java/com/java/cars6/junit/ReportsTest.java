package com.java.cars6.junit;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import com.java.cars6.model.Reports;

public class ReportsTest {

	@Test
    public void testConstructor() {
        Reports report = new Reports();
        assertNotNull(report);
        Reports report1 = new Reports(1, 1, 2, Date.valueOf("2023-05-01"), "Report details", "Open");
        assertEquals(1, report1.getReportID());
        assertEquals(1, report1.getIncidentID());
        assertEquals(2, report1.getReportingOfficer());
        assertEquals(Date.valueOf("2023-05-01"), report1.getReportDate());
        assertEquals("Report details", report1.getReportDetails());
        assertEquals("Open", report1.getStatus());
    }

    @Test
    public void testGettersAndSetters() {
        Reports report = new Reports();
        report.setReportID(1);
        report.setIncidentID(1);
        report.setReportingOfficer(2);
        report.setReportDate(Date.valueOf("2023-05-01"));
        report.setReportDetails("Report details");
        report.setStatus("Open");

        assertEquals(1, report.getReportID());
        assertEquals(1, report.getIncidentID());
        assertEquals(2, report.getReportingOfficer());
        assertEquals(Date.valueOf("2023-05-01"), report.getReportDate());
        assertEquals("Report details", report.getReportDetails());
        assertEquals("Open", report.getStatus());
    }

    @Test
    public void testHashCode() {
        Reports report1 = new Reports(1, 1, 2, Date.valueOf("2023-05-01"), "Report details", "Open");
        Reports report2 = new Reports(1, 1, 2, Date.valueOf("2023-05-01"), "Report details", "Open");
        assertEquals(report1.hashCode(), report2.hashCode());
    }

    @Test
    public void testEquals() {
        Reports report1 = new Reports(1, 1, 2, Date.valueOf("2023-05-01"), "Report details", "Open");
        Reports report2 = new Reports(1, 1, 2, Date.valueOf("2023-05-01"), "Report details", "Open");
        Reports report3 = new Reports(2, 1, 2, Date.valueOf("2023-05-01"), "Report details", "Open");

        assertTrue(report1.equals(report2));
        assertTrue(report2.equals(report1));
        assertTrue(report1.equals(report1));
        assertFalse(report1.equals(report3));
        assertFalse(report2.equals(report3));
        assertFalse(report1.equals(null));
        assertFalse(report1.equals("Some String"));
    }

    @Test
    public void testToString() {
        Reports report = new Reports(1, 1, 2, Date.valueOf("2023-05-01"), "Report details", "Open");
        String result = "Reports [ReportID=1, IncidentID=1, ReportingOfficer=2, ReportDate=2023-05-01, ReportDetails=Report details, Status=Open]";
        assertEquals(result, report.toString());
    }

}