package com.capgemini.flight.MakeMyTrip;



public class Flight {

	int flightNo;
	String airlines,origin,destination;
	String departureTime,arrivalTime,routeTime;
	String cost;
	static int autoFlightNoGen;
	{
		flightNo=++autoFlightNoGen;
	}
	
	
	public Flight( String airlines, String origin, String destination, 
			String arrivalTime, String departureTime,String routeTime, String cost) {
		super();
		
		this.airlines = airlines;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.routeTime = routeTime;
		this.cost = cost;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getRouteTime() {
		return routeTime;
	}
	public void setRouteTime(String routeTime) {
		this.routeTime = routeTime;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", airlines=" + airlines + ", origin=" + origin + ", destination="
				+ destination + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", routeTime="
				+ routeTime + ", cost=" + cost + "]";
	}
	
	
	
	
	
	
	
	
}
