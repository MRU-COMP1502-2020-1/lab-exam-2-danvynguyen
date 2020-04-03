package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class B_ATest {

	@Test
	public void getMatchTest() {
		LRule rule = new B_A();
		assertEquals('B', rule.getMatch());
	}
	
	@Test
	public void getBodyTest() {
		LRule rule = new B_A();
		char[] expectedResult = {'A'};
		assertEquals(expectedResult, rule.getBody());
	}

}
