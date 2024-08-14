package caseStudyAssignments;



public class dayUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int day = 13; 
	        int month = 8; 

	        String dayString;
	        String monthString;

	        
	        switch (day % 7) {
	            case 0:
	            	dayString = "Sunday"; 
	            	break;
	            case 1: 
	            	dayString = "Monday"; 
	            	break;
	            case 2: 
	            	dayString = "Tuesday"; 
	            	break;
	            case 3: 
	            	dayString = "Wednesday";
	            	break;
	            case 4: 
	            	dayString = "Thursday";
	            	break;
	            case 5: 
	            	dayString = "Friday"; 
	            	break;
	            case 6: 
	            	dayString = "Saturday"; 
	            	break;
	            default: 
	            	dayString = "Invalid day"; 
	            	break;
	        }
	        
	        switch (month) {
            case 1: 
            	monthString = "January"; 
            	break;
            case 2: 
            	monthString = "February"; 
            	break;
            case 3: 
            	monthString = "March"; 
            	break;
            case 4: 
            	monthString = "April";
            	break;
            case 5: 
            	monthString = "May";
            	break;
            case 6: 
            	monthString = "June";
            	break;
            case 7: 
            	monthString = "July";
            	break;
            case 8: 
            	monthString = "August";
            	break;
            case 9: 
            	monthString = "September";
            	break;
            case 10: 
            	monthString = "October";
            	break;
            case 11:
            	monthString = "November";
            	break;
            case 12: 
            	monthString = "December";
            	break;
            default: 
            	monthString = "Invalid month";
            	break;
        }

        
        System.out.println("Today is " + dayString + ", " + monthString + " " + day + ".");
	    
		

	}

}
