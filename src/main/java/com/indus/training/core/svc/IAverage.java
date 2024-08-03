package com.indus.training.core.svc;

/**
 * This interface defines a contract for calculating the average of a set of
 * numbers. Implementing classes should provide the logic to compute the average
 * based on the given parameters.
 */
public interface IAverage {

	/**
	 * Calculates the average of the provided numbers.
	 * 
	 * @param param1 The first number to be included in the average calculation.
	 * @param paramn A variable number of additional numbers to be included in the
	 *               average calculation.
	 * @return The average of all the provided numbers.
	 */
	public double average(double param1, double... paramn);
}
