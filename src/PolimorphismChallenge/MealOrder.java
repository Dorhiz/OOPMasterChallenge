package PolimorphismChallenge;

public class MealOrder {
	private Burger burger;
	private Coke drink;
	private SideItem si;
	private String deluxe;
	
	public MealOrder () {
		burger = new Burger();
		drink = new Coke();
		si = new SideItem();
	}
	
	public MealOrder (Burger burger, Coke coke, SideItem sideItem) {
		this.burger = burger;
		this.drink = coke;
		this.si = sideItem;
		
	}
	
	public MealOrder (String deluxe, Burger burger, Coke coke, SideItem sideItem) {
		this.burger = burger;
		this.drink = coke;
		this.si = sideItem;
		this.deluxe = "deluxe";
	}
	
	protected void printItemizedReceipt() {
		System.out.println("ITEMIZED LIST:"
				+ "\n" + burger.getType() + ": $" + burger.getPrice() + burger.getToppings()
				+"\n" + drink.getType() + ": $" + drink.getPrize()
				+ "\n" + si.getType()+ ": $" + si.getPrice());
	}
	
	protected void printReceipt() {
		double total = burger.getPrice() + drink.getPrize() + si.getPrice();
		System.out.println("TOTAL: $" + total);
	}
	
	protected void printItemizedReceipt(String deluxe) {
		System.out.println("ITEMIZED LIST:"
				+ "\n" + burger.getType() + burger.getToppings()
				+"\n" + drink.getType() + "\n" + si.getType());
	}
	
	protected void printReceipt(String deluxe) {
		System.out.println("TOTAL: $ 200.00");
	}
}
