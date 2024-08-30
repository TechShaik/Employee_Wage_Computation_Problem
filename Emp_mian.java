package com.files;

import java.util.*;

public class Emp_mian {
    static ArrayList<String> Attendence = null;
    static ArrayList<String> part_time = null;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Scanner sc = new Scanner(System.in);
        Attendence = new ArrayList<>();
        part_time = new ArrayList<>();
        
        System.out.println("Select employment type (1 for Full time OR 2 for Part time)");
        System.out.println("(Press x to exit)");
        
        int emp_type = sc.nextInt();
        switch (emp_type) {
            case 1:
                System.out.println("Start entering the names of present employees and press x to exit");
                System.out.println("Enter the name of the employee: ");

                while (true) {
                    String name = sc.next();
                    if (name.equalsIgnoreCase("x")) {
                        break;
                    } else {
                        Attendence.add(name);
                    }
                }

                while (true) {
                    System.out.println("Select operation:");
                    System.out.println("Enter 1 to see attendance");
                    System.out.println("Enter 2 to check if an employee is present or not");
                    System.out.println("Enter 3 to calculate the daily wage of an employee");
                    System.out.println("Enter 4 to calculate the daily monthly of an employee");
                    System.out.println("Enter 5 to calculate the wage till to a condition reach");
                    System.out.println("Enter 6 to caluclate wage by method");
                    System.out.println("Enter 7 to caluclate wage for different company");
                    System.out.println("Enter 0 to exit");

                    int choice = sc.nextInt();
                    if (choice == 0) {
                        sc.close();
                        break;
                    } else {
                        switch (choice) {
                            case 1:
                                seeAttendence();
                                System.out.println();
                                break;
                            case 2:
                                System.out.println("Enter employee name:");
                                String emp = sc.next();
                                if (Attendence.contains(emp)) {
                                    System.out.println(emp + " is Present");
                    		        System.out.println();

                                } else {
                                    System.out.println(emp + " is Absent");
                    		        System.out.println();
                                         }
                                        break;
                            case 3:
                                int per_hr = 20;
                                int hrs = 8;
                                System.out.println("Enter the name of the employee:");
                                String emp1 = sc.next();
                                float wage = per_hr * hrs;
                                System.out.println(emp1 + " wage is: " + wage);
                		        System.out.println();
                                break;
                                
                            case 4:
                            	 int per_hrs = 20;
                                 int hr = 8;
                                 int days=20;
                                 System.out.println("Enter the name of the employee:");
                                 String empp = sc.next();
                                 float wages = per_hrs * hr*days;
                                 System.out.println(empp + " wage is: " + wages);
                 		        System.out.println();
                                 break;
                                 
                            case 5:
                            	int totalWorkingHours = 0;
                            	int totalWorkingDays = 0;
                            	int wagePerHour = 15;
                            	int dailyWorkHours = 8;
                            	int totalWages = 0;

                            	while(totalWorkingHours < 100 && totalWorkingDays < 20) {
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
                                 break;
                            case 6:
                            	methods m=new methods();
                            	m.emp_wage();
                            	break;
                            case 7:
                            	companies c=new companies();
                            	while(true) {
                            	System.out.println("Select company");
                            	System.out.println("1 for TCS");
                            	System.out.println("2 for Apexon");
                            	System.out.println("3 for HCL");
                            	int com=sc.nextInt();
                            	if(com==0) {
                            		System.out.println();
                             		break;
                             		
                            	}else {
                            		switch(com) {
                            		case 1:
                            			c.tcs();
                            			break;
                            		case 2:
                            			c.apexon();
                            			break;
                            		case 3:
                            			c.hcl();                            		}
                            	}


                            	}
                        }
                    }
                }
                break;  
            case 2:
                System.out.println("Start entering the names of part time employees and press x to exit");
                System.out.println("Enter the name of the employee: ");

                while (true) {
                    String name = sc.next();
                    if (name.equalsIgnoreCase("x")) {
                        break;
                    } else {
                        part_time.add(name);
                    }
                }

                System.out.println("Press yes to calculate part-time employee wage:");
                String n = sc.next();
                
                if (n.equalsIgnoreCase("yes")) { 
                	while(true) {
                	System.out.println("Select 1 for daily-wage 2 for monthly-wage and 0 to exit");
                    System.out.println("Enter 3 to calculate the wage till to a condition reach");
                	int m=sc.nextInt();
                	if(m==0) {
                		sc.close();
                		break;
                	}else {
                	switch(m) {
                	case 1:

                    	System.out.println("Enter the Employee name : ");
                    	String nm=sc.next();
                             int pr = 18;
                            int hr = 4; 
                            float wage = pr * hr;
                            System.out.println(nm + " wage is: " + wage);
                            System.out.println();
                           break;
                	case 2:
                		int per_hrs = 20;
                        int hrss = 8;
                        int days=20;
                        System.out.println("Enter the name of the employee:");
                        String empp = sc.next();
                        float wages = per_hrs * hrss*days;
                        System.out.println(empp + " wage is: " + wages);
                        System.out.println();
                        break;
                	case 3:
                		int totalWorkingHours = 0;
                		int totalWorkingDays = 0;
                		int wagePerHour = 15;
                		int dailyWorkHours = 8;
                		int totalWages = 0;

                		while(totalWorkingHours < 100 && totalWorkingDays < 20) {
                		    totalWorkingDays++;
                		    if(totalWorkingHours + dailyWorkHours > 100) {
                		        // Calculate the hours needed to reach 100 hours
                		        int remainingHours = 100 - totalWorkingHours;
                		        totalWorkingHours += remainingHours;
                		        totalWages += remainingHours * wagePerHour;
                		        System.out.println();
                		    } else {
                		        totalWorkingHours += dailyWorkHours;
                		        totalWages += dailyWorkHours * wagePerHour;
                		        System.out.println();
                		    }
                		}

                		System.out.println("Total Wages: $" + totalWages);
                		System.out.println();

                       
                	}
                        } 
                           }
                	}else {
                           	System.out.println("Data inserted");
                          }
                }
        }
                               // Methods start here
    public static void seeAttendence() {
        System.out.println("Employees present today are: " + Attendence);
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
