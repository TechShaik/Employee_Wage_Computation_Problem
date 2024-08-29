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
                    System.out.println("Enter 0 to exit");

                    int choice = sc.nextInt();
                    if (choice == 0) {
                        sc.close();
                        break;
                    } else {
                        switch (choice) {
                            case 1:
                                seeAttendence();
                                break;
                            case 2:
                                System.out.println("Enter employee name:");
                                String emp = sc.next();
                                if (Attendence.contains(emp)) {
                                    System.out.println(emp + " is Present");
                                } else {
                                    System.out.println(emp + " is Absent");
                                }
                                break;
                            case 3:
                                int per_hr = 20;
                                int hrs = 8;
                                System.out.println("Enter the name of the employee:");
                                String emp1 = sc.next();
                                float wage = per_hr * hrs;
                                System.out.println(emp1 + " wage is: " + wage);
                                break;
                            case 4:
                            	 int per_hrs = 20;
                                 int hr = 8;
                                 int days=20;
                                 System.out.println("Enter the name of the employee:");
                                 String empp = sc.next();
                                 float wages = per_hrs * hr*days;
                                 System.out.println(empp + " wage is: " + wages);
                                 break;
                            	
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
                	System.out.println("Enter wage type 1 for daily-wage 2 for monthly-wage and 0 to exit");
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
                           break;
                	case 2:
                		int per_hrs = 20;
                        int hrss = 8;
                        int days=20;
                        System.out.println("Enter the name of the employee:");
                        String empp = sc.next();
                        float wages = per_hrs * hrss*days;
                        System.out.println(empp + " wage is: " + wages);
                        break;
                       
                	}
                        } 
                           }}else {
                           	System.out.println("Data inserted");
                          }}}
                           // Methods start here
    public static void seeAttendence() {
        System.out.println("Employees present today are: " + Attendence);
    }
}
