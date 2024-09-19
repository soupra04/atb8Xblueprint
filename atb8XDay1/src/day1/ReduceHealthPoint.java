package day1;

public class ReduceHealthPoint {

	public static void main(String[] args) {

		/*Imagine you are creating a simple game.
		The player starts with 100 health points. 
		Write a program that simulates an attack on the player that reduces health by 20 points using a compound operator. Simulate three consecutive attacks and print the player's health after each attack.*/
		
		int health = 100;
		int damage = 20;
		
		health -= damage; // health = health - damage //1st attack
		System.out.println(health);
		
		health -= damage;  //2nd attack
		System.out.println(health);
		
		health -= damage;  //3rd attack
		System.out.println(health);
		//test

	}

}
