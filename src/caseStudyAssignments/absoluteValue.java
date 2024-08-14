package caseStudyAssignments;
import java.util.Scanner;
public class absoluteValue {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	       
	        int absoluteValue;
	        if (number < 0) {
	            absoluteValue = -number;
	        } else {
	            absoluteValue = number;
	        }

	       
	        System.out.println("The absolute value of " + number + " is " + absoluteValue);

	}

}
