package com.files;

public class companies {
	
	public void tcs() {
		int totalWorkingHours = 0;
    	int totalWorkingDays = 0;
    	int wagePerHour = 25;
    	int dailyWorkHours = 8;
    	int totalWages = 0;

    	while(totalWorkingHours < 80 && totalWorkingDays < 18) {
    	    totalWorkingDays++;
    	    if(totalWorkingHours + dailyWorkHours > 80) {
    	        // Calculate the hours needed to reach 100 hours
    	        int remainingHours = 80 - totalWorkingHours;
    	        totalWorkingHours += remainingHours;
    	        totalWages += remainingHours * wagePerHour;
    	    } else {
    	        totalWorkingHours += dailyWorkHours;
    	        totalWages += dailyWorkHours * wagePerHour;
    	    }
    	}

    	System.out.println("Total Wages: $" + totalWages);
    	System.out.println();
	}
	
	public void apexon() {
		int totalWorkingHours = 0;
    	int totalWorkingDays = 0;
    	int wagePerHour = 18;
    	int dailyWorkHours = 8;
    	int totalWages = 0;

    	while(totalWorkingHours < 100 && totalWorkingDays < 22) {
    	    totalWorkingDays++;
    	    if(totalWorkingHours + dailyWorkHours > 100) {
    	        // Calculate the hours needed to reach 100 hours
    	        int remainingHours = 100 - totalWorkingHours;
    	        totalWorkingHours += remainingHours;
    	        totalWages += remainingHours * wagePerHour;
    	    } else {
    	        totalWorkingHours += dailyWorkHours;
    	        totalWages += dailyWorkHours * wagePerHour;
    	    }
    	}

    	System.out.println("Total Wages: $" + totalWages);
    	System.out.println();
	}
	public void hcl() {
		int totalWorkingHours = 0;
    	int totalWorkingDays = 0;
    	int wagePerHour = 15;
    	int dailyWorkHours = 8;
    	int totalWages = 0;

    	while(totalWorkingHours < 120 && totalWorkingDays < 22) {
    	    totalWorkingDays++;
    	    if(totalWorkingHours + dailyWorkHours > 120) {
    	        // Calculate the hours needed to reach 100 hours
    	        int remainingHours = 120 - totalWorkingHours;
    	        totalWorkingHours += remainingHours;
    	        totalWages += remainingHours * wagePerHour;
    	    } else {
    	        totalWorkingHours += dailyWorkHours;
    	        totalWages += dailyWorkHours * wagePerHour;
    	    }
    	}

    	System.out.println("Total Wages: $" + totalWages);
    	System.out.println();
	}
	}
