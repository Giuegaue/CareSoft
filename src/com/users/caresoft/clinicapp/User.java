package com.users.caresoft.clinicapp;

public class User {
	
	
    protected Integer id;
    
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
    protected int pin;
    
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		if (pin > 999 && pin < 10000)
		this.pin = pin;
	}
	
	public boolean assignPin(int pin) {
		return true;
		
	}
	
	public boolean accessAuthorized(Integer confirmedAuthID) {
		
		return false;
	}
    
	public User(int id) {
		this.id = id;
	}
}

