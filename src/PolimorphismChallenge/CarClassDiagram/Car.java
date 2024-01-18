package PolimorphismChallenge.CarClassDiagram;

public class Car {
	private String description;
	
	public Car(String description) {
		this.description = description;
	}

	public void startEngine() {
		System.out.println("Starting engine!");	
		}
	
	public void drive() {
		System.out.println("Driving");
	}
	
	protected void runEngine() {
		System.out.println("Runing engine");
	}
}




