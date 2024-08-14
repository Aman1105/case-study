package caseStudyAssignments;
import java.util.Scanner;

public class passwordAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String pre_defined_userID = "admin";
	     String pre_defined_pass = "admin123";	 
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter your user id");
		String user_id = in.nextLine();
		
		System.out.println("enter your password");
		String pass = in.nextLine();
		
		in.close();
		
		if(user_id.equals(pre_defined_userID)&& pass.equals(pre_defined_pass)) {
			System.out.println("Authentication Passed");
		}
		
		else {
			System.out.println("Authentication Failed");
		}

	}

}
