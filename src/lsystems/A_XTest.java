package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_XTest {

	@Test
	public void getMatchTest() {
		LRule rule = new A_X();
		assertEquals('A', rule.getMatch());
	}
	
	@Test
	public void getBodyTest() {
		LRule rule = new A_X();
		char[] expectedResult = {};
		assertEquals(expectedResult, rule.getBody());
	}

}
