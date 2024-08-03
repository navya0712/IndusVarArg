package com.indus.training.core.svc;

/**
 * This interface defines a contract for performing addition on a set of
 * numbers. Implementing classes should provide the logic to compute the sum
 * based on the given parameters.
 */
public interface IAddition {

	/**
	 * Computes the sum of the provided numbers.
	 * 
	 * @param param1 The first number to be included in the addition.
	 * @param paramn A variable number of additional numbers to be included in the
	 *               addition.
	 * @return The sum of all the provided numbers.
	 */
	public double add(double param1, double... paramn);

}
