package PolimorphismChallenge;

import java.util.Scanner;

public class JoesBurgerChallengeMain {

	public static void main(String[] args) {
		String typeOfBurger, sizeDrink, typeDrink, sideItem;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a meal to order:\nC -> Classic Order \nP -> Personalized Combo \nD -> Deluxe Combo");
		String typeOfMeal = sc.next();
		if (typeOfMeal.toLowerCase().equals("p")) {
			System.out.println("Select your burger:\nC -> Classic burger \nD -> Deluxe burguer \nO -> Double Burger");
			typeOfBurger = sc.next();
			Burger burger = Burger.getBurger(typeOfBurger);
			System.out.println("Select your drink size:\nS -> Small \nM -> Medium \nL -> Large");
			sizeDrink = sc.next();
			System.out.println("Select your drink flavor:\nA -> Cider \nC-> Coke \nD -> Diet");
			typeDrink = sc.next();
			Coke drink = new Coke(typeDrink, sizeDrink);
			System.out.println("Choose your side item: \nF -> fries\nS -> Salad");
			sideItem = sc.next();
			SideItem side = new SideItem(sideItem);
			MealOrder personalizedCombo = new MealOrder(burger, drink, side);
			personalizedCombo.printItemizedReceipt();
			personalizedCombo.printReceipt();
		} else if (typeOfMeal.toLowerCase().equals("d")) {
			System.out.println("Select your burger:\nC -> Classic burger \nD -> Deluxe burguer \nO -> Double Burger");
			typeOfBurger = sc.next();
			Burger burger = Burger.getBurger(typeOfBurger);
			System.out.println("Select your drink size:\nS -> Small \nM -> Medium \nL -> Large");
			sizeDrink = sc.next();
			System.out.println("Select your drink flavor:\nA -> Cider \nC-> Coke \nD -> Diet");
			typeDrink = sc.next();
			Coke drink = new Coke(typeDrink, sizeDrink);
			System.out.println("Choose your side item: \nF -> fries\nS -> Salad");
			sideItem = sc.next();
			SideItem side = new SideItem(sideItem);
			MealOrder personalizedCombo = new MealOrder(burger, drink, side);
			personalizedCombo.printItemizedReceipt("deluxe");
			personalizedCombo.printReceipt("deluxe");
		}
		else {
			MealOrder classicMeal = new MealOrder();
			classicMeal.printItemizedReceipt();
			classicMeal.printReceipt();
		}
		
		sc.close();
		System.exit(0);
	}
}
