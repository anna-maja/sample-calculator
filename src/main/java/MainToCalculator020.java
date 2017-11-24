
/**
 * Main class. 
 **/

public class MainToCalculator020 {
	public static void main(String[] args){
		
		Calculator020 calculator = new Calculator020();
		
		System.out.println("\nDivision 0/0: \n" + calculator.divide(0, 0));
		System.out.println("\nDivision 0/5: \n" +calculator.divide(0, 5));
		System.out.println("\nDivision 5/0: \n" +calculator.divide(5, 0));
		System.out.println("\nDivision 5/2: \n" + calculator.divide(5, 2));

	
	}

}
