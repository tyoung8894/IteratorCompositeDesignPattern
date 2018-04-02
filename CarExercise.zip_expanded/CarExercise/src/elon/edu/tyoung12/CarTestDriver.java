package elon.edu.tyoung12;

public class CarTestDriver {
	public static void main(String[] args) {
		Component extColorComponent = new CostComposite("Exterior", "Ruby Flare Pearl", 0.00);
		Component intColorComponent = new CostComposite("Interior", "Black SofTex", 0.00);
		Component carComponent = new CostComposite("Model", "Camry Hybrid 2018 SE", 29500.00);
		carComponent.add(extColorComponent);
		carComponent.add(intColorComponent);
		
		carComponent.add(new CostItem(
				"Blind Spot Monitor",
				"Blind Spot Monitor",
				600.00));
		
		carComponent.add(new CostItem(
				"Carpet Mats",
				"",
				299.00));
		
		carComponent.add(new CostItem(
				"Delivery, Process, and Handling Fee",
				"",
				895.00));

		CarBuyer carBuyer = new CarBuyer(carComponent);
		carBuyer.printCars();
	}
}
