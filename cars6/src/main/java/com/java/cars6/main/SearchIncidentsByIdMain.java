
package com.java.cars6.main;

import java.util.Scanner;

import com.java.cars6.dao.IncidentsDao;
import com.java.cars6.dao.IncidentsDaoImpl;
import com.java.cars6.model.Incidents;
import com.java.cars6.myexceptions.IncidentNumberNotFoundException;

public class SearchIncidentsByIdMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter IncidentID:");
        int incidentID = sc.nextInt();
        sc.nextLine();

        IncidentsDao dao = new IncidentsDaoImpl();
        try {
            Incidents incident = dao.SearchIncidentsByID(incidentID);
            if (incident == null) {
                throw new IncidentNumberNotFoundException("Incident not found with ID: " + incidentID);
            }
            System.out.println(incident);
        } catch (IncidentNumberNotFoundException e) {
            System.err.println("Incident number not found: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
