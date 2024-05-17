package com.java.cars6.junit;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import com.java.cars6.model.Incidents;

public class IncidentTest {

	@Test
    public void testConstructor1() {
		Incidents inc = new Incidents();
		assertNotNull(inc);

        Incidents incident = new Incidents(1, "Theft", Date.valueOf("2023-05-01"), 37.7749, 
        		-122.4194, "Sample description", "Open", 30, 15);
    
        assertEquals(1, incident.getIncidentID());
        assertEquals("Theft", incident.getIncidentType());
        assertEquals(Date.valueOf("2023-05-01"), incident.getIncidentDate());
        assertEquals(37.7749, incident.getLatitude(), 0.0001);
        assertEquals(-122.4194, incident.getLongitude(), 0.0001);
        assertEquals("Sample description", incident.getDes());
        assertEquals("Open", incident.getStatus());
        assertEquals(30, incident.getVictimID());
        assertEquals(15, incident.getSuspectID());
    }
	
	@Test
	public void testGettersAndSetters() {
		Incidents incident = new Incidents();
		incident.setIncidentID(1);
		incident.setIncidentType("Theft");
		incident.setIncidentDate(Date.valueOf("2023-05-01"));
		incident.setLatitude(37.7749);
		incident.setLongitude(-122.4194);
		incident.setDes("Sample description");
		incident.setStatus("Open");
		incident.setVictimID(30);
		incident.setSuspectID(15);
		
		assertEquals(1, incident.getIncidentID());
        assertEquals("Theft", incident.getIncidentType());
        assertEquals(Date.valueOf("2023-05-01"), incident.getIncidentDate());
        assertEquals(37.7749, incident.getLatitude(), 0.0001);
        assertEquals(-122.4194, incident.getLongitude(), 0.0001);
        assertEquals("Sample description", incident.getDes());
        assertEquals("Open", incident.getStatus());
        assertEquals(30, incident.getVictimID());
        assertEquals(15, incident.getSuspectID());
	}
	
	@Test
	public void testHashCode() {
		Incidents incident = new Incidents(1, "Theft", Date.valueOf("2023-05-01"), 37.7749, 
        		-122.4194, "Sample description", "Open", 30, 15);
		Incidents incident2 = new Incidents(1, "Theft", Date.valueOf("2023-05-01"), 37.7749, 
        		-122.4194, "Sample description", "Open", 30, 15);
		assertEquals(incident.hashCode(), incident2.hashCode());
	}
	
	@Test
	public void testEquals() {
		Date date = Date.valueOf("2023-05-01");
        Incidents incident1 = new Incidents(1, "Theft", date, 37.7749, -122.4194, "Sample description", "Open", 2, 3);
        Incidents incident2 = new Incidents(1, "Theft", date, 37.7749, -122.4194, "Sample description", "Open", 2, 3);
        Incidents incident3 = new Incidents(2, "Robbery", date, 37.7749, -122.4194, "Another description", "Closed", 5, 6);
        
        assertTrue(incident1.equals(incident2));
        assertTrue(incident2.equals(incident1));
        assertTrue(incident1.equals(incident1));
        assertFalse(incident1.equals(incident3));
        assertFalse(incident2.equals(incident3));
        assertFalse(incident1.equals(null));
        assertFalse(incident1.equals("Some String"));
	}
	
	@Test
	public void testToString() {
		Incidents incident = new Incidents(1, "Theft", Date.valueOf("2023-05-01"), 37.7749, 
        		-122.4194, "Sample description", "Open", 30, 15);
		String result = "Incidents [IncidentID=1, IncidentType=Theft, IncidentDate=2023-05-01, Latitude=37.7749, "
				+ "Longitude=-122.4194, Des=Sample description, Status=Open, VictimID=30, "
				+ "SuspectID=15]";
		assertEquals(result, incident.toString());
	}
}
