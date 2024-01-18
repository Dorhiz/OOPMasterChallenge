package PolimorphismChallenge.CarClassDiagram;

public class HibridCar extends Car {
	
	// not necesary private HibridCar th;
	private double avgKmPerLitre = 0;
	private int batterySize = 0, cylinders = 0;
	
	public HibridCar(String description, int cylinders, int batterySize, double avgKmPerLitre) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.cylinders = cylinders;
		this.batterySize = batterySize;
	}

	public void startEngine() {
		System.out.printf("Am I on gas, or on batteries?\n"
				+ "Why not both? I have %d batteries and %d cylinders", batterySize, cylinders);	
		}
	
	public void drive() {
		System.out.printf("Sort of clean driving on a " + getClass().getSimpleName() + "\n"
				+ "At "+avgKmPerLitre+"kms per litre");
	}
}
