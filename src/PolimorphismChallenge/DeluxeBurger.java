package PolimorphismChallenge;

import java.util.Scanner;

public class DeluxeBurger extends Burger {
	private String type;
	private double price;
	private String toppings;
	
	public DeluxeBurger() {
		this.type = "Deluxe Burger";
		this.price = 120;
	}
	
	protected double addToppings() {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i <5; i++){
			System.out.println("Would you like to add some toppings?\nType M for mushrooms "
					+ "\nType B for Bacon \nType A for Avocado \nType N for None");
			String topping = scanner.next();
			if (topping.toLowerCase().equals("m")) {
				// add type of topping to meal
				toppings += "\nadd Mushrooms";
			} else if (topping.toLowerCase().equals("b")) {
				// add type of topping to meal
				toppings += "\nadd Bacon";
			} else if (topping.toLowerCase().equals("a")) {
				// add type of topping to meal
				toppings += "\nadd Avocado";
			} else if (topping.toLowerCase().equals("n")) {
				break;
			}
		} 
		//scanner.close();
		//System.out.println("The choosed toppings are:" + toppings);
		return 0;
	}
	
	protected double getPrice() {
		return price;
	}
	
	protected String getType() {
		return type;
	}
	
	protected String getToppings() {
		return toppings;
	}
}
