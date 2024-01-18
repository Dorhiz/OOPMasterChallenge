package PolimorphismChallenge.CarClassDiagram;

public class GasPoweredCar extends Car {

	private GasPoweredCar th; 
	private double avgKmPerLitre = 0;
	private int cylinders = 0;
	
	public GasPoweredCar(String description, int cylinders, double avgKmPerLitre) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.cylinders = cylinders;
		th = this;
		System.out.println("Lemme contamminate mothafucka");
	}
	
	public void startEngine() {
		System.out.println("Burning gas fuel on the "+ cylinders +" cylinders");	
		}
	
	public void drive() {
		System.out.println("Clean driving on a " + th.getClass().getSimpleName()
				+ "\n On "+avgKmPerLitre+" per litre");
	}

}
