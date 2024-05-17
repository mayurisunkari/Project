
package com.java.cars6.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.cars6.model.Officers;

public class OfficersTest {

	@Test
    public void testConstructor() {
        Officers officer = new Officers();
        assertNotNull(officer);
        Officers officer1 = new Officers(1, "John", "Doe", "123ABC", "Sergeant", "9876543210", "123 Main St", 1);
        assertEquals(1, officer1.getOfficerID());
        assertEquals("John", officer1.getFirstName());
        assertEquals("Doe", officer1.getLastName());
        assertEquals("123ABC", officer1.getBadgeNumber());
        assertEquals("Sergeant", officer1.getRanking());
        assertEquals("9876543210", officer1.getPhoneNumber());
        assertEquals("123 Main St", officer1.getAddress());
        assertEquals(1, officer1.getAgencyID());
    }
	@Test
    public void testGettersAndSetters() {
        Officers officer = new Officers();
        officer.setOfficerID(1);
        officer.setFirstName("John");
        officer.setLastName("Doe");
        officer.setBadgeNumber("123ABC");
        officer.setRanking("Sergeant");
        officer.setPhoneNumber("9876543210");
        officer.setAddress("123 Main St");
        officer.setAgencyID(1);
        
        assertEquals(1, officer.getOfficerID());
        assertEquals("John", officer.getFirstName());
        assertEquals("Doe", officer.getLastName());
        assertEquals("123ABC", officer.getBadgeNumber());
        assertEquals("Sergeant", officer.getRanking());
        assertEquals("9876543210", officer.getPhoneNumber());
        assertEquals("123 Main St", officer.getAddress());
        assertEquals(1, officer.getAgencyID());
    }
	
	@Test
    public void testHashCode() {
        Officers officer1 = new Officers(1, "John", "Doe", "123ABC", "Sergeant", "9876543210", "123 Main St", 1);
        Officers officer2 = new Officers(1, "John", "Doe", "123ABC", "Sergeant", "9876543210", "123 Main St", 1);
        assertEquals(officer1.hashCode(), officer2.hashCode());
    }
	@Test
	public void testEquals() {
	    Officers officer1 = new Officers(1, "John", "Doe", "12345", "Sergeant", "9876543210", "123 Main St", 2);
	    Officers officer2 = new Officers(1, "John", "Doe", "12345", "Sergeant", "9876543210", "123 Main St", 2);
	    Officers officer3 = new Officers(2, "Jane", "Smith", "54321", "Lieutenant", "9876543211", "456 Oak St", 3);
	    assertTrue(officer1.equals(officer2));
	    assertTrue(officer2.equals(officer1));
	    assertTrue(officer1.equals(officer1));
	    assertFalse(officer1.equals(officer3));
	    assertFalse(officer2.equals(officer3));
	    assertFalse(officer1.equals(null));
	    assertFalse(officer1.equals("Some String"));
	}

	
	@Test
    public void testToString() {
        Officers officer = new Officers(1, "John", "Doe", "123ABC", "Sergeant", "9876543210", "123 Main St", 1);
        String result = "Officers [OfficerID=1, FirstName=John, LastName=Doe, BadgeNumber=123ABC, Ranking=Sergeant, PhoneNumber=9876543210, Address=123 Main St, AgencyID=1]";
        assertEquals(result, officer.toString());
    }

}
