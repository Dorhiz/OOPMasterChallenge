package PolimorphismChallenge;

public class DoubleBurger extends Burger {
	
	private String type;
	private double price;
	
	public DoubleBurger() {
		this.type = "Double Burger";
		this.price = 100 + addToppings();
	}
		
	@Override
	protected double getPrice() {
		return price;
	}
	
	@Override
	protected String getType() {
		return type;
	}
}
