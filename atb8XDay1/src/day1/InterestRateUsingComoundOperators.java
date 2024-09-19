package day1;

public class InterestRateUsingComoundOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program that calculates the interest on a savings account. Assume an initial balance of 1000. Every year, interest is compounded by 5%. Use a compound operator to calculate the new balance after 3 years.
		double balance = 1000;
		double interestRate = 0.05;
		
		//using compound operators
		
		balance += balance * interestRate;  // balance = balance + interestRate
		balance += balance * interestRate; //year 2
		balance += balance * interestRate; //year 3
		
		
		System.out.println(balance);
	
				
	}

}
