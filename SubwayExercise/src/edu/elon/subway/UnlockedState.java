package edu.elon.subway;

public class UnlockedState implements State {
	SubwayNew subway;
	
	public UnlockedState(SubwayNew subway) {
		this.subway = subway;
	}
	
	@Override
	public void coin() {
		System.out.println("Thank you");
		
	}

	@Override
	public void pass() {
		subway.setState(subway.getLockedState());
		System.out.println("locked!");
	}

}
