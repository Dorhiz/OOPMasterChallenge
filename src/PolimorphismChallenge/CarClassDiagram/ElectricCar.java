package PolimorphismChallenge.CarClassDiagram;

public class ElectricCar extends Car {
	
	private double avgKmPerCharge = 0;
	private int batterySize = 0;
	private ElectricCar th;
	
	public ElectricCar(String description, int batterySize, double avgKmPerCharge) {
		super(description);
		System.out.println("I'm better than y'all!");
		this.batterySize = batterySize;
		this.avgKmPerCharge = avgKmPerCharge;
		th = this;
	}

	public void startEngine() {
		System.out.println("Did you charge me? Ok, lemme start \n"
				+ "on my " + batterySize + "powercell");
		
		}
	
	public void drive() {
		System.out.println("Clean driving on a " + th.getClass().getSimpleName()
		+ "\n On " + avgKmPerCharge + " per litre");
	}
}
