package caseStudyAssignments;

public class cricketScore {
	
	int sixes =2;
	int four =1;
	int single_run =10;
	int total_run =0;
	
	public void six() {
        sixes++;
        total_run += 6;
    }

    public void four() {
        four++;
        total_run += 4;
    }
    public void singleRun() {
        single_run++;
        total_run += 1;
    }

    public int getTotalRuns() {
        return total_run;
    }

    public void displayScore() {
        System.out.println("Total runs: " + total_run);
        System.out.println("Sixes: " + sixes);
        System.out.println("Fours: " + four);
        System.out.println("Single runs: " + single_run);
    }
    
    

	public static void main(String[] args) {
		 cricketScore match = new cricketScore();
	        
	        
	        match.six();
	        match.four();
	        match.singleRun();
	        
	        
	        match.displayScore();

	}

}
