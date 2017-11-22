
/**
 * Main class. 
 **/

public class MainToCalculator020 {
	public static void main(String[] args){
		
		Calculator020 calculator = new Calculator020();
		
		double firstNumber = 3; 
		double secondNumber = 6; 
		
		System.out.println("Addition with " + firstNumber + " and " + secondNumber + " = " + calculator.add(firstNumber, secondNumber));
		System.out.println("Subtraction with " + firstNumber + " and " + secondNumber + " = " +calculator.subtract(firstNumber, secondNumber));
		System.out.println("Multiplication with " + firstNumber + " and " + secondNumber + " = " +calculator.multiply(firstNumber, secondNumber));
		System.out.println("Division with " + firstNumber + " and " + secondNumber + " = " +calculator.divide(firstNumber, secondNumber));
		System.out.println("Division with " + firstNumber + " and " + 0 + " = " +calculator.divide(firstNumber, 0));
		
	}

}
