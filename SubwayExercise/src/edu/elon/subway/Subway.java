package edu.elon.subway;

public class Subway {

	public enum State { 
		LOCKED, UNLOCKED
	}
	private State state;
	
	
	public Subway() {
		state = State.LOCKED;
	}
	
	public void depositCoin() {
		if (state == State.LOCKED) {
			unlock();
			state = State.UNLOCKED;
		}
		else if (state == State.UNLOCKED) {
			thankyou();
		}
	}
	
	public void pass() {
		if (state == State.LOCKED) {
			alarm();
		}
		else if (state == State.UNLOCKED) {
			lock();
			state = State.LOCKED;
		}
	}
	
	public void unlock() {
		System.out.println("Unlocked!");
	}
	
	public void thankyou() {
		System.out.println("Thank you");
	}
	
	public void alarm() {
		System.out.println("Alarm!");
	}
	
	public void lock() {
		System.out.println("Locked!");
	}
	
	public State getState() {
		return state;
	}
}
