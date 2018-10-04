package com.capgemini.flight.MakeMyTrip;

public class Main {
	public static void main(String[] args)
	{
		
		
FlightDetails a=new FlightDetails();
	
	a.add(new Flight("Jet1","Bangalore","chennai","7:00","9:00","2:00","2000"));
	
	a.add(new Flight("Jet2","Mumbai","Kolkota","12:00","4:00","4:00","5000"));
	a.add(new Flight("Air India","Bangalore","Delhi","9:00","12:00","3:00","4000"));
	a.add(new Flight("Air Ways","Hyderabad","New Delhi","15:00","18:00","3:00","3500"));
	
	
	
	for(Flight acc:a.getAllflightdetails()) {
	System.out.println(acc);
	}
	System.out.println("--------------------------");
	// a.deleteAccountByID(1);
	System.out.println(a.getflightByNo(1));
	System.out.println("--------------------------");
	for(Flight acc:a.updateFlight(2,"Jet-Air")) {
		System.out.println(acc);
 
		}
	System.out.println("--------------------------");

	
	for(Flight acc:a.deleteFlightByNo(3)) {
		System.out.println(acc);
 
		}
	System.out.println("--------------------------");
	
	

	}
}
