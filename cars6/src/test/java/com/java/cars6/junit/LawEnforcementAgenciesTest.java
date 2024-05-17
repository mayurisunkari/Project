package com.java.cars6.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.cars6.model.Evidence;
import com.java.cars6.model.LawEnforcementAgencies;

public class LawEnforcementAgenciesTest {

	@Test
	public void testConstructor() {
		LawEnforcementAgencies law = new LawEnforcementAgencies(31,	"Andhra Pradesh Police Department","Statewide",
				"9876543210","Andhra Pradesh");
		assertNotNull(law);
		assertEquals(31, law.getAgencyID());
		assertEquals("Andhra Pradesh Police Department", law.getAgencyName());
		assertEquals("Statewide", law.getJurisdiction());
		assertEquals("9876543210", law.getPhoneNumber());
		assertEquals("Andhra Pradesh", law.getAddress());
		
	}
	@Test
	public void testGettersAndSetters() {
		LawEnforcementAgencies law = new LawEnforcementAgencies();
		law.setAgencyID(31);
		law.setAgencyName("Andhra Pradesh Police Department");
		law.setJurisdiction("Statewide");
		law.setPhoneNumber("9876543210");
		law.setAddress("Andhra Pradesh");
		assertEquals(31, law.getAgencyID());
		assertEquals("Andhra Pradesh Police Department", law.getAgencyName());
		assertEquals("Statewide", law.getJurisdiction());
		assertEquals("9876543210", law.getPhoneNumber());
		assertEquals("Andhra Pradesh", law.getAddress());
				
	}
	@Test
	public void testHashCode() {
		LawEnforcementAgencies law = new LawEnforcementAgencies(31,"Andhra Pradesh Police Department","Statewide",
				"9876543210","Andhra Pradesh");
		LawEnforcementAgencies law1 = new LawEnforcementAgencies(31,"Andhra Pradesh Police Department","Statewide",
				"9876543210","Andhra Pradesh");
		assertEquals(law.hashCode(), law1.hashCode());
	}
	

	    @Test
	    public void testEquals() {
	        // Create instances with identical properties
	        LawEnforcementAgencies agency1 = new LawEnforcementAgencies(1, "Police Department", "Citywide", "1234567890", "123 Main St");
	        LawEnforcementAgencies agency2 = new LawEnforcementAgencies(1, "Police Department", "Citywide", "1234567890", "123 Main St");
	        LawEnforcementAgencies agency3 = new LawEnforcementAgencies(2, "Sheriff's Office", "Countywide", "0987654321", "456 Elm St");
	        assertTrue(agency1.equals(agency2));
	        assertTrue(agency2.equals(agency1));
	        assertTrue(agency1.equals(agency1));
	        assertFalse(agency1.equals(agency3));
	        assertFalse(agency2.equals(agency3));
	        assertFalse(agency1.equals(null));
	        assertFalse(agency1.equals("Some String"));
	    }
	

	
	@Test
	public void testToString() {
		LawEnforcementAgencies law = new LawEnforcementAgencies(31,"Andhra Pradesh Police Department","Statewide",
				"9876543210","Andhra Pradesh");
		String str ="LawEnforcementAgencies [AgencyID=31, AgencyName=Andhra Pradesh Police Department, "
				+ "Jurisdiction=Statewide, PhoneNumber=9876543210, Address=Andhra Pradesh]";
		assertEquals(law.toString(), str);
		
	}
	

}