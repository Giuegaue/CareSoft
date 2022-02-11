package com.users.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

import com.caresoft.clinicapp.HIPAACompliantUser;

public class Physician extends User implements HIPAACompliantUser {
     
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
	
    public Physician(int i) {
    	super(i);
		// TODO Auto-generated constructor stub
	}

	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		return pin>999 && pin< 9999;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return this.id == confirmedAuthID;
	}


}
