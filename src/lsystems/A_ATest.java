package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_ATest {

	@Test
	public void getMatchTest() {
		LRule rule = new A_A();
		assertEquals('A', rule.getMatch());
	}
	
	@Test
	public void getBodyTest() {
		LRule rule = new A_A();
		char[] expectedResult = {'A'};
		assertEquals(expectedResult, rule.getBody());
	}

}
