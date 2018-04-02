package elon.edu.tyoung12;

public class CarBuyer {
	Component allCars;
	
	public CarBuyer(Component allCars) {
		this.allCars = allCars;
	}
	
	public void printCars() {
		System.out.print("Total Cost Summary");
		allCars.print();
		System.out.println("\n" + "                       Total MSRP as built " + allCars.getPrice());
	}
}
