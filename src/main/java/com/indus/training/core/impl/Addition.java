package com.indus.training.core.impl;

import com.indus.training.core.svc.IAddition;

/**
 * This class implements the IAddition interface and provides functionality to
 * perform addition on a set of numbers.
 */
public class Addition implements IAddition {

	/**
	 * Calculates the sum of the given numbers.
	 * 
	 * @param param1 The first number to be included in the addition.
	 * @param paramn A variable number of additional numbers to be included in the
	 *               addition.
	 * @return The sum of all the provided numbers.
	 */
	public double add(double param1, double... paramn) {
		double result = 0.0;
		{
			result = result + param1;
			for (int i = 0; i < paramn.length; i++) {
				result += paramn[i];
			}

		}
		return result;
	}

}
