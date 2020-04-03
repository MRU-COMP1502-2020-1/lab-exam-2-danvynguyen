package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class C_BTest {

	@Test
	public void getMatchTest() {
		LRule rule = new C_B();
		assertEquals('C', rule.getMatch());
	}
	
	@Test
	public void getBodyTest() {
		LRule rule = new C_B();
		char[] expectedResult = {'B'};
		assertEquals(expectedResult, rule.getBody());
	}
}
