import java.io.IOException; 
/**
 * 
 * Class Calculator020. My version of sample-calculator from Rafael Silva. 
 * An implementation of a simple calculator. i.e. the four basic operations in arithmetics. 
 * The methods take double as parameters and return a double value.
 * 
 * 
 * 
 *@author Anna-Maja
 *@version 1.0 
 * 
 **/
public class Calculator020 {
	
	/**
	 * Add- add two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the addition.
	 * */
	public double add(double firstNumber, double secondNumber){
		return firstNumber+secondNumber;
	}
	
	/**
	 * subtract - subtracts two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the subtraction.
	 * */
	public double subtract(double firstNumber, double secondNumber){
		return firstNumber-secondNumber;
	}
	
	/**
	 * multiply - multiplies two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the multiplication.
	 * */
	public double multiply(double firstNumber, double secondNumber){
		return firstNumber*secondNumber;
	}
	
	/**
	 * divide- divides two doubles. Catches if secondNumber is zero.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the division.
	 * */
	
	public double divide(double firstNumber, double secondNumber){
		try {
			secondNumber = 0; 
		} catch (ArithmeticException e) {
			e.getMessage(); 
		}
		return firstNumber/secondNumber; 
		
	}
	
	
	

}
