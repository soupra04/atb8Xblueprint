package day1;

public class Elevator_Floor_Counter {

	public static void main(String[] args) {
		
		//Write a program that simulates an elevator going up in a building. The elevator starts at the ground floor (0) and moves up to the 5th floor. Use the increment operator to track the current floor and print the floor number each time the elevator moves up.
		
		 int currentFloor = 0; // Ground floor
		 System.out.println("the floor number is " + currentFloor);
		 
		 int floor_count1 = ++currentFloor;
		 System.out.println("the floor number is " +floor_count1);
		 
		 int floor_count2 = ++currentFloor;
		 System.out.println("the floor number is " +floor_count2);
		 
		 int floor_count3 = ++currentFloor;
		 System.out.println("the floor number is " +floor_count3);
		 
		 int floor_count4 = ++currentFloor;
		 System.out.println("the floor number is " +floor_count4);
		 
		 

	}

}
