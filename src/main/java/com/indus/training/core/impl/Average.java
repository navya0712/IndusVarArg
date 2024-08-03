package com.indus.training.core.impl;

import com.indus.training.core.svc.IAverage;

/**
 * This class implements the IAverage interface to calculate the average of a
 * set of numbers.
 */
public class Average implements IAverage {

	/**
	 * Calculates the average of the given numbers.
	 * 
	 * @param param1 The first number to be included in the average calculation.
	 * @param paramn A variable number of additional numbers to be included in the
	 *               average calculation.
	 * @return The average of all the provided numbers.
	 */
	@Override
	public double average(double param1, double... paramn) {
		double result = 0.0;
		{
			result = result + param1;
			for (int i = 0; i < paramn.length; i++) {
				result += paramn[i];
			}

		}
		return result / (paramn.length + 1);
	}

}
