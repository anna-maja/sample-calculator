import static org.junit.Assert.*;


import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorSubtractTest {
	private static final Logger LOG = Logger.getLogger(Calculator020.class.getName());
	Calculator020 calculator = new Calculator020();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();
	/**
	 * For all methods, I will create a local value, to compare with the value from the method in question.
	 * The two values should be the same.
	 * Focus here is on testing subtraction.
	 */
	
	@Test
	/**
	 * This testmethod tests the method subtract in the class Calculator witn positive numbers 0 to 10
	 */
	public void testSubtractSmallPositiveNumbers() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with random numbers 0-10: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
		}
		LOG.info("\n");
	}

	@Test
	/**
	 * This testmethod tests the method subtract in the class Calculator witn positive numbers 0 to 100
	 */
	public void testSubtractMediumPositiveNumbers() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with random numbers 0-100: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
		}
		LOG.info("\n");
	}
	

	@Test
	/**
	 * This testmethod tests the method subtract in the class Calculator witn positive numbers 0 to 1000
	 */
	public void testSubtractLargePositiveNumbers() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with random numbers 0-1000: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);
		}
		LOG.info("\n");
	}

	/**
	 * This testmethod tests the method subtract in the class Calculator witn negative numbers 0 to -10
	 */
	@Test
	public void testSubtractSmallNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -10));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method subtract with random numbers 0- (-10): " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}
	
	/**
	 * This testmethod tests the method subtract in the class Calculator witn negative numbers 0 to -100
	 */
	@Test
	public void testSubtractMediumNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -100));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method subtract with random numbers 0- (-100): " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}
	
	/**
	 * This testmethod tests the method subtract in the class Calculator witn negative numbers 0 to -1000
	 */
	@Test
	public void testSubtractLargeNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -1000));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with random numbers 0- (-1000): " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}
	/**
	 * This testmethod tests the method subtract in the class Calculator with one number zero
	 */
	@Test
	public void testSubtractOneNumberIsZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with one zero and one random number 0- 100: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}
	
	/**
	 * This testmethod tests the method subtract in the class Calculator with both numbers zero
	 */
	@Test
	public void testSubtractOBothNumbersAreZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			result = firstNumber - secondNumber;

			LOG.info("Testing the method subtract with r2 zeros: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}


}
