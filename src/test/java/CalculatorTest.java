import static org.junit.Assert.*;


import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	private static final Logger LOG = Logger.getLogger(Calculator020.class.getName());
	Calculator020 calculator = new Calculator020();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();
	/**
	 * For all methods, I will create a local value, to compare with the value from the method in question.
	 * The two values should be the same.
	 */

	@Test
	public void testAddSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with random numbers 0-10: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

	@Test
	/**
	 * This testmethod tests the method add in the class Calculator with positive random generated numbers 0-100
	 */
	public void testAddMeduimSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) { // jag kör 200 varv
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100)); // genererar nummer 0-100
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100)); // genererar nummer 0-100
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with random numbers 0-100: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

	@Test
	/**
	 * This testmethod tests the method add in the class Calculator with positive random generated numbers 0-1000
	 */
	public void testAddLargePositiveNumbers() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with numbers 0-1000: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}
	
	@Test
	/**
	 * This testmethod tests the method add in the class Calculator witn negative numbers 0 to -10
	 */
	public void testAddSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -10));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with random numbers 0- (-10): " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

	@Test
	/**
	 * This testmethod tests the method add in the class Calculator with negative random generated numbers 0 to -100
	 */
	public void testAddMeduimSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) { 
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -100)); // genererar nummer 0- -100
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -100)); // genererar nummer 0- -100
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with random numbers 0-(-100): " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

	@Test
	/**
	 * This testmethod tests the method add in the class Calculator with negative random generated numbers 0 to -1000
	 */
	public void testAddLargeNegativeNumbers() {


		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -1000));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with numbers 0 t0o -1000: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}
	
	@Test
	/**
	 * This testmethod tests the method add in the class Calculator with random generated numbers 0 to 1000 and firstNumber = 0
	 */
	public void testAddOneNumberIsZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with numbers 0 and random 0-1000: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}
	
	@Test
	/**
	 * This testmethod tests the method add in the class Calculator with both numbers are 0
	 */
	public void testAddBothNumbersAreZero() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			result = firstNumber + secondNumber;

			LOG.info("Testing the method add with numbers 0 and 0: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

}
