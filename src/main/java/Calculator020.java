import java.io.IOException;

/**
 * 
 * Class Calculator020. My version of sample-calculator from Rafael Silva. An
 * implementation of a simple calculator. i.e. the four basic operations in
 * arithmetics. The methods take double as parameters and return a double value.
 * 
 * 
 * 
 * @author Anna-Maja
 * @version 1.0
 * 
 **/
public class Calculator020 {

	/**
	 * Add- add two doubles.
	 * 
	 * @param firstNumber
	 *            : the first number as a double
	 * @param secondNumber:
	 *            the second number as a double
	 * 
	 * @return: the result of the addition.
	 */
	public double add(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	/**
	 * subtract - subtracts two doubles.
	 * 
	 * @param firstNumber
	 *            : the first number as a double
	 * @param secondNumber:
	 *            the second number as a double
	 * 
	 * @return: the result of the subtraction.
	 */
	public double subtract(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	/**
	 * multiply - multiplies two doubles.
	 * 
	 * @param firstNumber
	 *            : the first number as a double
	 * @param secondNumber:
	 *            the second number as a double
	 * 
	 * @return: the result of the multiplication.
	 */
	public double multiply(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	/**
	 * divide- divides two doubles. Catches if secondNumber is zero.
	 * 
	 * @param firstNumber
	 *            : the first number as a double
	 * @param secondNumber:
	 *            the second number as a double
	 * 
	 * @return: the result of the division.
	 */

	public double divide(double firstNumber, double secondNumber) {
		double sum = 0;
		if (secondNumber != 0) {
			sum = firstNumber / secondNumber;
		} else {
			System.out.println("\nDivision by zero is not possible and will give the fake result -0.123456789");
			sum = -0.123456789;
		}
		return sum;
	}

	/*
	 * if (secondNumber == 0) {
	 * System.out.println("Division by zero is not possible."); return -0.123456789;
	 * } else { return firstNumber / secondNumber; }
	 */
	/*
	 * try { sum = value1 / value2; } catch (ArithmeticException e) {
	 * summaryTxt.setText("Invalid operation: " + e.getMessage()); }
	 */
}
