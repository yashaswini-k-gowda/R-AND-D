package com.capgemini.flight.MakeMyTrip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;





public class FlightDetails {
ArrayList<Flight> acc1 = new ArrayList();
	
	
	public ArrayList<Flight> getAllFlightList() {
		return acc1;
	
	}
	
	
	public void add(Flight f) {
		acc1.add(f);
	}
	
	
	public ArrayList<Flight> deleteFlightByNo(int flightNo) {
		  for(Flight acc:acc1) {
	        	if(acc.getFlightNo()==flightNo) {
	        		 acc1.remove(flightNo);
	        		return acc1;
	        	
	        }
		  }
	        throw new RuntimeException("flight details not found"); 
	        }	
	
	


    public ArrayList<Flight> updateFlight(int flightNo, String airlines) {
    	 for(Flight acc:acc1) {
    		 if(acc.getFlightNo()==flightNo) {
              acc.setAirlines(airlines);
              return acc1;
        }
 }

        throw new RuntimeException("Account does not exist");
}


 

 public ArrayList<Flight> getAllflightdetails() {
        return acc1;
        
 }

 public Flight getflightByNo(int flightNo) {
        for(Flight acc:acc1) {
        	if(acc.getFlightNo()==flightNo)
        		return acc;
        	
        }
        throw new RuntimeException("flight details not found"); 
        }
      
 public ArrayList<Flight> sortFlightByName()
 {
	 Collections.sort(acc1,new Comparator<Flight>() {
		 
		 
		 public int compare(Flight acc1,Flight acc2)
		 {
			 return acc1.getAirlines().compareTo(acc2.getAirlines());
			 
	
		 }
	 });
	 
		 return acc1;
		 
 }
	 
 
 public ArrayList<Flight> sortFlightByDuration(String originCity,String DestnCity){
     acc1.sort((trip1, trip2)->trip1.getRouteTime().compareTo(trip2.getRouteTime()));
     return acc1;
            }

public ArrayList<Flight> sortFlightByPrice(String source,String destination){
     acc1.sort((trip1, trip2)->trip1.getCost().compareTo(trip2.getCost()));
     ArrayList<Flight> cheapflight=new ArrayList<Flight>();
     
     for(Flight fly : acc1){
            if(fly.getOrigin().equals(source) && fly.getDestination().equals(destination)){
                  cheapflight.add(fly);
            }
            }
     return cheapflight;
}

     public ArrayList<Flight> sortFlightByTime(String source,String destination){
            acc1.sort((trip1, trip2)->trip1.getRouteTime().compareTo(trip2.getRouteTime()));
            ArrayList<Flight> flightTime=new ArrayList<Flight>();
            
            for(Flight fly : acc1){
                  if(fly.getOrigin().equals(source) && fly.getDestination().equals(destination)){
                         flightTime.add(fly);
                  }
                  }
            return flightTime;
}
     
/*public ArrayList<Flight> morningFlight(String source,String destination){
     ArrayList<Flight> morningTime=new ArrayList<Flight>();
     
     for(Flight fly : acc1){
            if(fly.getArrivalTime()<12 && fly.getDepartureTime()<12)
                  morningTime.add(fly);
     }
     return morningTime;
}
}

*/
 }
	
 
 
 

	