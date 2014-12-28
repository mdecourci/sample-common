package org.netpod.utility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UtilityTest {

	private Utility utility;
	
	@Before
	public void beforeTest() {
		utility = new Utility();
	}
	
	@Test
	public void test() {
		String actual = utility.getStatus(1);
		assertEquals("10", actual);
	}
	
	@Test
	public void test1() {
		String actual = utility.getStatus(2);
		assertEquals("20", actual);
	}
	
	@Test
	public void test2() {
		String actual = utility.getStatus(3);
		assertEquals("30", actual);
	}
	
	@Test
	public void testx() {
		String actual = utility.getStatus(10);
		assertEquals("Yikes", actual);
	}

}
