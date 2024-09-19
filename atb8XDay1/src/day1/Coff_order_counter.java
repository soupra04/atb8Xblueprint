package day1;

public class Coff_order_counter {

	public static void main(String[] args) {
		// Imagine you own a coffee shop and need to track the number of coffee orders one by one as they come in. The starting number of orders is 0. Simulate receiving three individual coffee orders using the increment operator and print the total after each order.
		
		//increment operators
		int coffeeOrders = 0; // Initial count of coffee orders
		
		int conffe1 = ++coffeeOrders;
		System.out.println("no of coffe " + conffe1);
		
		int conffe2 = ++coffeeOrders;
		System.out.println("no of coffe " + conffe2);
		
		int conffe3 = ++coffeeOrders;
		System.out.println("no of coffe " + conffe3);
		
		

	}

}
