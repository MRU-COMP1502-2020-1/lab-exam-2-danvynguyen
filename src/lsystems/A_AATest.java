package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_AATest {

	@Test
	public void getMatchTest() {
		LRule rule = new A_AA();
		assertEquals('A', rule.getMatch());
	}
	
	@Test
	public void getBodyTest() {
		LRule rule = new A_AA();
		char[] expectedResult = {'A','A'};
		assertEquals(expectedResult, rule.getBody());
	}

}
