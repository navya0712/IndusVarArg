package com.indus.training.core.svc;

import com.indus.training.core.impl.Average;

import junit.framework.TestCase;

/**
 * Provides test cases for Average class
 */
public class TestAverage extends TestCase {
	private Average avgObj = null;

	/**
	 * Sets up the test environment
	 */
	protected void setUp() throws Exception {
		avgObj = new Average();
	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		avgObj = null;
	}

	/**
	 * Tests average method with 2 parameters
	 */

	public void testAverageScenario1() {

		// 1. Inputs
		double param1 = 2.0;
		double param2 = 3.0;

		// 2. Expected Result
		double expResult = 2.5;

		// 3. Actual Result
		double actResult = avgObj.average(param1, param2);

		// 4,. Assertion
		assertEquals(actResult, expResult, 0);
	}

	/**
	 * Tests average method with 3 parameters
	 */
	public void testAverageScenario2() {

		// 1. Inputs
		double param1 = 2.0;
		double param2 = 3.0;
		double param3 = 1.0;

		// 2. Expected Result
		double expResult = 2.0;

		// 3. Actual Result
		double actResult = avgObj.average(param1, param2, param3);

		// 4,. Assertion
		assertEquals(actResult, expResult, 0);
	}

}
