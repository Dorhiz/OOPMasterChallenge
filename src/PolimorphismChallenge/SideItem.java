package PolimorphismChallenge;

public class SideItem {
	private String type;
	private double price;
	
	public SideItem() {
		this.price = 45.5;
		this.type = "Fries";
	}
	
	public SideItem(String type) {		
		if (type.toLowerCase().equals("f")) {
			this.price = 45.5;
			this.type = "Fries";
		} else if (type.toLowerCase().equals("s")) {
			this.price = 55.5;
			this.type = "Salad";
		}
	}
	
	protected double getPrice() {
		return price;
	}
	
	protected String getType() {
		return type;
	}
}
