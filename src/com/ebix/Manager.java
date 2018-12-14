package com.ebix;

public class Manager extends Employee {
	
	private boolean hasSeparateCabin;
	
	public Manager() {
		
	}
    public Manager(int id, String name, int salary, boolean hasSeparateCabin) {
    	super(id,name,salary);
    	this.hasSeparateCabin=hasSeparateCabin;
		
	}
    public void printMessage() {
		System.out.println("Manager Class"); 
	 }
	public boolean isHasSeparateCabin() {
		return hasSeparateCabin;
	}
	public void setHasSeparateCabin(boolean hasSeparateCabin) {
		this.hasSeparateCabin = hasSeparateCabin;
	}
    
}
