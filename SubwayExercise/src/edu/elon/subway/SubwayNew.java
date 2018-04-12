package edu.elon.subway;

public class SubwayNew {
	State unlockedState;
	State lockedState;
	State state;
	
	
	public SubwayNew() {
		unlockedState = new UnlockedState(this);
		lockedState = new LockedState(this);
		state = lockedState;
	}
	
	public void coin() {
		state.coin();
	}
	
	public void pass() {
		state.pass();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	public State getUnlockedState() {
		return unlockedState;
	}
	
	public State getLockedState() {
		return lockedState;
	}
	
	public State getState() {
		return state;
	}
}
