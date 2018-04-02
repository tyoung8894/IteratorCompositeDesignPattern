package elon.edu.tyoung12;

public abstract class Component {
	
	public void add(Component carComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(Component carComponent) {
		throw new UnsupportedOperationException();
	}
	
	public Component getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public void print() {
		throw new UnsupportedOperationException();
	}
	
}
