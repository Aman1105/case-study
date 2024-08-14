// Base class representing SBI Bank

package caseStudyAssignments;

public class sbiBank {
	 void homeLoan() {
	        System.out.println("SBI Bank provides Home Loan.");
	    }

	    void vehicleLoan() {
	        System.out.println("SBI Bank provides Vehicle Loan.");
	    }

	    void personalLoan() {
	        System.out.println("SBI Bank provides Personal Loan.");
	    }

	    void creditCardLoan() {
	        System.out.println("SBI Bank provides Credit Card Loan.");
	    }

	    void propertyLoan() {
	        System.out.println("SBI Bank provides Property Loan.");
	    }
	}

	// Derived class where creditCardLoan() overrides vehicleLoan()
	class SBIBankOverride extends sbiBank {
	    @Override
	    void creditCardLoan() {
	        System.out.println("SBI Bank provides Credit Card Loan with special benefits.");
	    }

	    @Override
	    void vehicleLoan() {
	        System.out.println("SBI Bank provides Vehicle Loan with lower interest rates.");
	    }
	

 
	    public static void main(String[] args) {
	        SBIBankOverride sbi = new SBIBankOverride();
	        
	        sbi.homeLoan();
	        sbi.vehicleLoan();
	        sbi.personalLoan();
	        sbi.creditCardLoan();
	        sbi.propertyLoan();
}}
