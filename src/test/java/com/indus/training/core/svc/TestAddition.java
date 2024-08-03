package com.indus.training.core.svc;

import com.indus.training.core.impl.Addition;

import junit.framework.TestCase;

/**
 * Test class for verifying the functionality of the Addition class.
 */
public class TestAddition extends TestCase {

	private Addition addObj = null;

	/**
	 * Sets up the test environment
	 */
	protected void setUp() throws Exception {
		addObj = new Addition();
	}

	/**
	 * Tears the test environment
	 */
	protected void tearDown() throws Exception {
		addObj = null;
	}

	/**
	 * Tests the add method with 2 parameters
	 */
	public void testAddScenario1() {

		// 1. Inputs
		double param1 = 2.0;
		double param2 = 3.0;

		// 2. Expected Result
		double expResult = 5.0;

		// 3. Actual Result
		double actResult = addObj.add(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Tests the add method with 3 parameters
	 */
	public void testAddScenario2() {

		// 1. Inputs
		double param1 = 2.0;
		double param2 = 3.0;
		double param3 = 6.0;

		// 2. Expected Result
		double expResult = 11.0;

		// 3. Actual Result
		double actResult = addObj.add(param1, param2, param3);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

}
