package PolimorphismChallenge;

import java.util.Scanner;

public class Burger {
	private String type;
	private double price;
	private String toppings;
	
	public Burger() {
		this.type = "Simple Burger";
		this.price = 70;
	}
	
	public Burger(String type) {
		this.type = "Classic Burger";
		this.price = 70 + addToppings();
		
	}
	
	protected static Burger getBurger(String type) {
		return switch (type.toUpperCase().charAt(0)) {
		case 'D' -> new DeluxeBurger();
		case 'O' -> new DoubleBurger();
		case 'C'-> new Burger(type);
		default ->  new Burger();
		};
		
	}

	protected double addToppings() {
		double toppingsPrice = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <3; i++){
			System.out.println("Would you like to add some toppings?\nType M for mushrooms "
					+ "\nType B for Bacon \nType A for Avocado \nType N for None");
			String topping = sc.nextLine();
			if (topping.toLowerCase().equals("m")) {
				toppingsPrice += 15;
				toppings += "\nadd mushrooms";
			} else if (topping.toLowerCase().equals("b")) {
				toppingsPrice += 20;
				toppings += "\nadd bacon";
			} else if (topping.toLowerCase().equals("a")) {
				toppingsPrice += 20;
				toppings += "\nadd avocado";
			} else if (topping.toLowerCase().equals("")) {
				break;
			}
			
		} 
		//sc.close();
		return toppingsPrice;
	}
	
	protected String getType() {
		return type;
	}
	
	protected double getPrice() {
		return price;
	}
	
	protected String getToppings() {
		return toppings;
	}
}
