package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			if (n == 0) {
				return 0;
			}
			
			return Math.pow(0.5, n) + geometricSum(n-1);
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
		
			if (p % q == 0) {
				return q;
			}
			
			return gcd(q, p % q);
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	
	public static int[] helper(int index, int[] arr) {
		
		int leftIndex = index;
		int rightIndex = arr.length - 1 - index;
		
		if (leftIndex >= rightIndex) {
			return arr;
		}
		
		if (leftIndex <= rightIndex) {
			
			int swap = arr[leftIndex];
			arr[leftIndex] = arr[rightIndex];
			arr[rightIndex] = swap;
			
		} 
		
		return helper(index + 1, arr);
	}
	
	public static int[] toReversed(int[] array) {
		
			int[] newArray = new int[array.length];
			
			for (int index = 0; index < array.length; index++) {
				newArray[index] = array[index];
			}
			
		
			if (array.length == 0) {
				return newArray;
			} else if (array.length == 1) {
				return newArray;
			}
		
			// FIXME create a helper method that can recursively reverse the given array
			return helper(0, newArray);
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
