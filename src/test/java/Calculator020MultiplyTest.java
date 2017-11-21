import static org.junit.Assert.*;


import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class Calculator020MultiplyTest {
	
	private static final Logger LOG = Logger.getLogger(Calculator020.class.getName());
	Calculator020 calculator = new Calculator020();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();
	
	@Test
	/**
	 * Tests the method multiply in class Calculator 020 with random doubles btw 0 and 10
	 */
	public void testMultiplySmallPositiveNumbers() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with random numbers 0-10: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}
	
	@Test
	/**
	 * Tests the method multiply in class Calculator020 with random doubles btw 0 and 100
	 */
	public void testMultiplyMediumPositiveNumbers() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with random numbers 0-100: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}
	
	@Test
	/**
	 * Tests the method multiply in class Calculator020 with random doubles btw 0 and 1000
	 */
	public void testMultiplyLargePositiveNumbers() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with random numbers 0-1000: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}
	
	@Test
	/**
	 * Tests the method multiply in class Calculator020 with random doubles btw 0 and -10
	 */
	public void testMultiplySmallNegativeNumbers() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -10));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with random numbers 0 to -10: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}	
	/**
	 * Tests the method multiply in class Calculator020 with random doubles btw 0 and -100
	 */
	@Test
	public void testMultiplyMediumNegativeNumbers() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -100));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with random numbers 0 to -100: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}	

	/**
	 * Tests the method multiply in class Calculator020 with random doubles btw 0 and -100
	 */
	@Test
	public void testMultiplyLargeNegativeNumbers() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -1000));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with random numbers 0 to -1000: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}	

	/**
	 * Tests the method multiply in class Calculator020 with one zero and one random double btw 0 and 100
	 */
	@Test
	public void testMultiplyOneNumberIsZero() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with zero and a random number 0 to 100: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}	
	
	/**
	 * Tests the method multiply in class Calculator020 with one zero and one random double btw 0 and 100
	 */
	@Test
	public void testMultiplyBothNumbersAreZero() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			result = firstNumber * secondNumber;

			LOG.info("Testing the method multiply with two zeros: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}	

}
