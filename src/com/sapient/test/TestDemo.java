/**
 * 
 */
package com.sapient.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author prasingh40
 *
 */
public class TestDemo {

	/**
	 * @throws java.lang.Exception
	 */
	
	String str1= new String("test1");
	String str2= new String("test1");
	Integer val1=25;
	Integer val2=25;
			
	@Before
	public void setUp() throws Exception {
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testStringObject() {
		assertEquals(str1, str2);
	}
	
	@Test
	public void testIntVal() {
	assertEquals(val1,val2);
	}
}
