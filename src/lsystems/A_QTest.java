package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_QTest {

	@Test
	public void getMatchTest() {
		LRule rule = new A_Q();
		assertEquals('A', rule.getMatch());
	}
	
	@Test
	public void getBodyTest() {
		LRule rule = new A_Q();
		char[] expectedResult = {'Q'};
		assertEquals(expectedResult, rule.getBody());
	}

}
