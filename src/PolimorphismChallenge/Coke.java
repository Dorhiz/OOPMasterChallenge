package PolimorphismChallenge;

public class Coke {
	private String type, size;
	private double price =0;
	
	public Coke() {
		this.type = "Coke";
		this.size = "s";
		this.price = 30;		
	}
	
	public Coke(String type, String size) {
		this.size = size;
		
		if (type.toLowerCase().equals("a")) {
			this.type = "Cider";
		} else if (type.toLowerCase().equals("l")) {
			this.type = "Diet coke";
		} else {
			this.type = "Coke";
		}
		
		if (size.toLowerCase().equals("s")) {
			this.price = 30;
		} else if (size.toLowerCase().equals("m")) {
			this.price = 45;
		} else if (size.toLowerCase().equals("l")) {
			this.price = 50;
		}
	}
	
	protected double getPrize() {
		return price;
	}
	
	protected String getSize() {
		return size;
	}
	
	protected String getType() {
		return type;
	}
}
