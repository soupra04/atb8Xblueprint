package day1;

public class Parking_lot_problem {

	public static void main(String[] args) {
		// Problem: A parking lot has a total of 50 parking spots. When a car enters, the number of available spots decreases by 1. When a car exits, the number of available spots increases by 1. Simulate a scenario where three cars enter and two cars exit the parking lot using the increment and decrement operators, and print the available spots after each action.

		//3 car enters
		//2 car exist
		
		int parking_slots= 50;
		parking_slots--;
		System.out.println("no of available parking slot: " +parking_slots);
		
		parking_slots--;
		System.out.println("no of available parking slot: " +parking_slots);
		
		 parking_slots--;
		System.out.println("no of available parking slot: " +parking_slots);
		
	parking_slots++;
		System.out.println("no of available parking slot: " +parking_slots);
		
	parking_slots++;
		System.out.println("no of available parking slot: " +parking_slots);
		
		System.out.println("Current available no of parking slot is: " + parking_slots);
		
		
		
	}

}
