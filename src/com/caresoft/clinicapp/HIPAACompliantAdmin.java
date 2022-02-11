package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;
public interface HIPAACompliantAdmin {
    
    abstract ArrayList<String> reportSecurityIncidents();
    
    // DEFAULT IMPLEMENTED METHODS
    // Used to print security incidents. 
    public default void printSecurityIncidents() {
        System.out.println(reportSecurityIncidents());
    }
    
    // QA Test, PASS/FAIL of reports against QA expected results
    public default boolean adminQATest(ArrayList<String> expectedIncidents, Date date) {
        if (reportSecurityIncidents().equals(expectedIncidents)) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
            System.out.println(errorLog(date));
        }
        return reportSecurityIncidents().equals(expectedIncidents);
    }
    
    public default String errorLog(Date date) {
    	System.out.println(date + "ID" + User.getID());
    	return errorLog(date);
    	
    }
    
}
