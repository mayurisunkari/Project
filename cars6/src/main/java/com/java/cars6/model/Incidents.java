package com.java.cars6.model;

import java.sql.Date;
import java.util.Objects;

public class Incidents {
	private int IncidentID ;
    private String IncidentType ;
    private Date  IncidentDate;
    private Double Latitude; 
    private Double Longitude ;
    private String Des; 
    private String Status; 
    private int VictimID ; 
    private int SuspectID;
	public int getIncidentID() {
		return IncidentID;
	}
	public void setIncidentID(int incidentID) {
		IncidentID = incidentID;
	}
	public String getIncidentType() {
		return IncidentType;
	}
	public void setIncidentType(String incidentType) {
		IncidentType = incidentType;
	}
	public Date getIncidentDate() {
		return IncidentDate;
	}
	public void setIncidentDate(Date incidentDate) {
		IncidentDate = incidentDate;
	}
	public double getLatitude() {
		return Latitude;
	}
	public void setLatitude(double latitude) {
		Latitude = latitude;
	}
	public double getLongitude() {
		return Longitude;
	}
	public void setLongitude(double longitude) {
		Longitude = longitude;
	}
	public String getDes() {
		return Des;
	}
	public void setDes(String des) {
		Des = des;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getVictimID() {
		return VictimID;
	}
	public void setVictimID(int victimID) {
		VictimID = victimID;
	}
	public int getSuspectID() {
		return SuspectID;
	}
	public void setSuspectID(int suspectID) {
		SuspectID = suspectID;
	}
	@Override
	public String toString() {
		return "Incidents [IncidentID=" + IncidentID + ", IncidentType=" + IncidentType + ", IncidentDate="
				+ IncidentDate + ", Latitude=" + Latitude + ", Longitude=" + Longitude + ", Des=" + Des + ", Status="
				+ Status + ", VictimID=" + VictimID + ", SuspectID=" + SuspectID + "]";
	}
	public Incidents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Incidents(int incidentID, String incidentType, Date incidentDate, double latitude, double longitude,
			String des, String status, int victimID, int suspectID) {
		
		IncidentID = incidentID;
		IncidentType = incidentType;
		IncidentDate = incidentDate;
		Latitude = latitude;
		Longitude = longitude;
		Des = des;
		Status = status;
		VictimID = victimID;
		SuspectID = suspectID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Des, IncidentDate, IncidentID, IncidentType, Latitude, Longitude, Status, SuspectID,
				VictimID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidents other = (Incidents) obj;
		return Objects.equals(Des, other.Des) && Objects.equals(IncidentDate, other.IncidentDate)
				&& IncidentID == other.IncidentID && Objects.equals(IncidentType, other.IncidentType)
				&& Double.doubleToLongBits(Latitude) == Double.doubleToLongBits(other.Latitude)
				&& Double.doubleToLongBits(Longitude) == Double.doubleToLongBits(other.Longitude)
				&& Objects.equals(Status, other.Status) && SuspectID == other.SuspectID && VictimID == other.VictimID;
	} 
  

}
