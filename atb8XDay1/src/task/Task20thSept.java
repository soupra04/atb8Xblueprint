package task;

public class Task20thSept {

	public static void main(String[] args) {
		
		
		
		// Write a program that classifies a triangle based on its side lengths.

		// Given three input values representing the lengths of the sides, determine

		// if the triangle is equilateral (all sides are equal),

		// isosceles (exactly two sides are equal), or

		// scalene (no sides are equal).

		// Use an if-else statement to classify the triangle.

		// side1, side2, side3 ->
		
		
		int side1 = 10;
		int side2 = 10;
		int side3 = 30;
		
		if ( side1 == side2 && side1 ==side3 && side2==side3)
		{
			System.out.println("equilateral");
		}
		else if (side1 == side2 || side1 ==side3 || side2==side3)
		{
			System.out.println("isosceles");
		}
		else
		{
			System.out.println("scalene");
		}
		

	}

}
