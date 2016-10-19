package org.aspect;

public class Benz implements Car {

	@Override
	public void running() {
		 System.out.println("Benz is running");
	}

	@Override
	public void off() {
		 System.out.println("Benz is off");
		
	}
	
	
	
}
