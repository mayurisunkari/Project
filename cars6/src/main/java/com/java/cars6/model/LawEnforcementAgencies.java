package com.java.cars6.model;

import java.util.Objects;

public class LawEnforcementAgencies {
	private int AgencyID;
    private String AgencyName;
    private String Jurisdiction;
    private String PhoneNumber;
    private String Address;
	public int getAgencyID() {
		return AgencyID;
	}
	public void setAgencyID(int agencyID) {
		AgencyID = agencyID;
	}
	public String getAgencyName() {
		return AgencyName;
	}
	public void setAgencyName(String agencyName) {
		AgencyName = agencyName;
	}
	public String getJurisdiction() {
		return Jurisdiction;
	}
	public void setJurisdiction(String jurisdiction) {
		Jurisdiction = jurisdiction;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "LawEnforcementAgencies [AgencyID=" + AgencyID + ", AgencyName=" + AgencyName + ", Jurisdiction="
				+ Jurisdiction + ", PhoneNumber=" + PhoneNumber + ", Address=" + Address + "]";
	}
	public LawEnforcementAgencies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LawEnforcementAgencies(int agencyID, String agencyName, String jurisdiction, String phoneNumber,
			String address) {
		super();
		AgencyID = agencyID;
		AgencyName = agencyName;
		Jurisdiction = jurisdiction;
		PhoneNumber = phoneNumber;
		Address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, AgencyID, AgencyName, Jurisdiction, PhoneNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LawEnforcementAgencies other = (LawEnforcementAgencies) obj;
		return Objects.equals(Address, other.Address) && AgencyID == other.AgencyID
				&& Objects.equals(AgencyName, other.AgencyName) && Objects.equals(Jurisdiction, other.Jurisdiction)
				&& Objects.equals(PhoneNumber, other.PhoneNumber);
	}
    
}
