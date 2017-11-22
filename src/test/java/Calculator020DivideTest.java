import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class Calculator020DivideTest {
	private static final Logger LOG = Logger.getLogger(Calculator020.class.getName());
	Calculator020 calculator = new Calculator020();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	/**
	 * For all methods, I will create a local value, to compare with the value from
	 * the method in question. The two values should be the same.
	 */

	@Test
	/**
	 * This testmethod tests the method divide in the class Calculator with positive
	 * random generated numbers 0-100
	 */
	public void testDivideSmallPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i <= 200; i++) { // jag kör 200 varv
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10)); // genererar nummer 0-100
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10)); // genererar nummer 0-100
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with random numbers 0-10: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

	@Test
	/**
	 * This testmethod tests the method divide in the class Calculator with positive
	 * random generated numbers 0-100
	 */
	public void testDivideMediumPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) { // jag kör 200 varv
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100)); // genererar nummer 0-100
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100)); // genererar nummer 0-100
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with random numbers 0-100: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

	@Test
	/**
	 * This testmethod tests the method divide in the class Calculator with positive
	 * random generated numbers 0-1000
	 */
	public void testDivideLargePositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) { // jag kör 200 varv
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000)); // genererar nummer 0-1000
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000)); // genererar nummer 0-1000
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with random numbers 0-1000: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

	@Test
	/**
	 * This testmethod tests the method divide in the class Calculator with negative
	 * random generated numbers 0 to -10
	 **/
	public void testDivideSmallNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) { // jag kör 200 varv
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -10)); // genererar nummer 0- -10
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -10)); // genererar nummer 0- -10
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with random numbers 0 to -10: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

	@Test
	/**
	 * This testmethod tests the method divide in the class Calculator with negative
	 * random generated numbers 0 to -100
	 **/
	public void testDivideMediumNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) { // jag kör 200 varv
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -100)); // genererar nummer 0- -100
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -100)); // genererar nummer 0- -100
			result = firstNumber / secondNumber;

			LOG.info(
					"Testing the method divide with random numbers 0 to -100: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

	@Test
	/**
	 * This testmethod tests the method divide in the class Calculator with negative
	 * random generated numbers 0 to -1000
	 **/
	public void testDivideLargeNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) { // jag kör 200 varv
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -1000)); // genererar nummer 0- -1000
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -1000)); // genererar nummer 0- -1000
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with random numbers 0 to -1000: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

	@Test
	/**
	 * This testmethod tests the method divide in the class Calculator with
	 * firstNumber = 0, secondNumber random 0-100
	 **/
	public void testDivideFirstIsZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) { // jag kör 200 varv
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100)); // genererar nummer 0-100
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with zero and random numbers 0 to 100: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

	@Test
	/**
	 * This testmethod tests the method divide in the class Calculator with
	 * both numbers zero
	 **/
	public void testDivideBothAreZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) { // jag kör 200 varv
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with two zeros: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

	@Test
	/**
	 * This testmethod tests the method divide in the class Calculator with
	 * firstNumber = random 0-100, secondNumber = 0.
	 **/
	public void testDivideSecondIsZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) { // jag kör 200 varv
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100)); // genererar nummer 0-100
			result = firstNumber / secondNumber;

			LOG.info("Testing the method divide with random numbers 0 to 100 and zero: " + firstNumber + " and "
					+ secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
		LOG.info("\n");
	}

}
