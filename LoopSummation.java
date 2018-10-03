/**
 * @author Sami Jenedi
 * This program will sum all the integers from a lower limit through an upper limit. It uses an initial loop to ensure a
 * valid upper and lower bound are entered.
 */
import java.util.Scanner;

public class LoopSummation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int upperLimit = 0;
		int lowerLimit = 0;
		int sum = 0;
		
		do {
			System.out.print("Lower limit: "); 
			lowerLimit = input.nextInt();
			
			System.out.print("Upper limit: "); 
			upperLimit = input.nextInt();
			System.out.println("");
		}
		while ( upperLimit < lowerLimit ); {
			for (int number = lowerLimit; number <= upperLimit; ++number) {
				 sum += number; 
			}
			System.out.print("The sum from " + lowerLimit + " through " + upperLimit + " is " + sum);
		}
	}

}
