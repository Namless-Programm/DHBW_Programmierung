package main;

import java.time.LocalDate;

import model.Flight;
import model.FlightConnection;

/**
 * Attributes
 */

public class D18_Attributes {

	public static void main(String[] args) {
		
		FlightConnection connection1 = new FlightConnection();
		
		connection1.airline = "Lufthansa";
		connection1.connectionId = "0400";
		connection1.arrivalAirport = "New York";
		connection1.depatureAirport = "Frankfurt";
		
		Flight flight1 = new Flight();
		Flight flight2 = new Flight();
		
		flight1.flightConnection = connection1;
		flight1.flightDate = LocalDate.now();
		flight1.flightPriceInEurp = 498.36;
		
		flight2.flightConnection = connection1;
		flight2.flightDate = LocalDate.of(2026, 2, 27);
		flight2.flightPriceInEurp = 333.33;
		
		System.out.println(flight2.flightConnection.airline);
		System.out.println(flight2.flightConnection.connectionId);
		System.out.println(flight2.flightConnection.depatureAirport);
		System.out.println(flight2.flightConnection.arrivalAirport);
		System.out.println(flight2.flightDate);
		System.out.println(flight2.flightPriceInEurp);
		

	}
}
