package edu.elon.subway;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubwayTests {
	Subway subway;
	public enum State {LOCKED, UNLOCKED};
	
	@BeforeEach
	void setUp() throws Exception {
		subway = new Subway();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		subway.pass();
		subway.depositCoin();
		subway.depositCoin();
		String expected = "UNLOCKED";
		String actual = subway.getState().toString();
		assertEquals(expected, actual);
	}

}
