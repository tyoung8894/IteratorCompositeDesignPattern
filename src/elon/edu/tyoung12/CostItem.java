package elon.edu.tyoung12;

public class CostItem extends Component {
	String name;
	String description;
	double price;
	
	public CostItem(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
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
		System.out.print(" " + getDescription());
		System.out.print("        $" + getPrice());
	}
}
