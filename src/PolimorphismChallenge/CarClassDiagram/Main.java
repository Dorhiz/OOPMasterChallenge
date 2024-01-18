package PolimorphismChallenge.CarClassDiagram;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Un carrito maton");
		car.runEngine();
		car.drive();
		
		System.out.println("-------------------------------------------------------");
		
		var elektriko = new ElectricCar("E", 5, 4.7);
		elektriko.runEngine();
		elektriko.drive();
		
		System.out.println("-------------------------------------------------------");
		
		var gaseoso = new GasPoweredCar("G", 8, 6.2);
		gaseoso.drive();
		gaseoso.runEngine();
		
		System.out.println("-------------------------------------------------------");
		
		var mutante = new HibridCar("H", 3, 4, 3.7);
		mutante.runEngine();
		mutante.drive();
	}

}
