package elon.edu.tyoung12;

import java.util.ArrayList;
import java.util.Iterator;

public class CostComposite extends Component {
	ArrayList<Component> carComponents = new ArrayList<Component>();
	String name;
	String description;
    double price;
	
	public CostComposite(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public void add(Component carComponent) {
		price += carComponent.getPrice();
		carComponents.add(carComponent);
	}
	
	public void remove(Component carComponent) {
		carComponents.remove(carComponent);
	}
	
	public Component getChild(int i) {
		return carComponents.get(i);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void print() {
		System.out.print("\n" + getName());
		System.out.print(":  " + getDescription());
		System.out.print("        $" + getPrice());
		
		Iterator<Component> iterator = carComponents.iterator();
		while (iterator.hasNext()) {
			Component carComponent = iterator.next();
			carComponent.print();
		}
	}
}
