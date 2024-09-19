package day1;

public class CompoundOperators {

	public static void main(String[] args) {
		
		
		//Create a program that calculates the total price of items in a shopping cart. Start with an initial total of 0. Add the prices of three items using compound operators and print the final total.
		
		int total_price = 0;
		int price1= 350;
		int price2 = 500;
		int price3 = 650;
		
		//using compund operators
		
		total_price += price1; // total_price = total_price + price1, now total price = 0+350= 350
		
		total_price += price2;
		
		total_price += price3; //total price becomes 350+500+650
		
		System.out.println(total_price);
		
		
	}

}
