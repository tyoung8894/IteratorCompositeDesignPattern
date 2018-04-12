package edu.elon.subway;

public class LockedState implements State {
	SubwayNew subway;
	
	public LockedState(SubwayNew subway) {
		this.subway = subway;
	}
	@Override
	public void coin() {
		System.out.println("Unlocked!");
		subway.setState(subway.getUnlockedState());
	}

	@Override
	public void pass() {
		System.out.println("Alarm!");
	}

}
