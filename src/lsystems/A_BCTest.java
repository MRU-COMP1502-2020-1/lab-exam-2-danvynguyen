package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_BCTest {

	@Test
	public void getMatchTest() {
		LRule rule = new A_BC();
		assertEquals('A', rule.getMatch());
	}
	
	@Test
	public void getBodyTest() {
		LRule rule = new A_BC();
		char[] expectedResult = {'B','C'};
		assertEquals(expectedResult, rule.getBody());
	}

}
