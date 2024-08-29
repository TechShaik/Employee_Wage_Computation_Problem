package com.files ;

import java.util.*;

public class Emp_mian {
	     static ArrayList<String> Attendence=null;
	public static void main(String[] args) {
              System.out.println("Welcome to Employee Wage Computation Program");
	        Scanner sc=new Scanner(System.in);
            Attendence= new ArrayList<>(); 
             System.out.println("start entering the names of present employees and press x to exit  ");
        	 System.out.println("Enter the name of the eployee : ");

             while(true) {
             	 String name=sc.next();
             if(name.equalsIgnoreCase("x")) {
            	 break;
             }else {
            	 Attendence.add(name);
             }}
             while(true) {
            	 
             System.out.println("Select operation:");
             System.out.println("Enter 1 to see attendence");
             System.out.println("enter 2 to check a employee is present or not");
             System.out.println("enter 3 to caluclate daily wage of any employee");
             System.out.println("Enter 0 to exit");

                int choice=sc.nextInt();
                if(choice==0) {
                	sc.close();
                	break;
                	
                }else {
              switch(choice) {
             
             case 1: 
            	 seeAttendence();
            	 break;
             case 2:
            	 String emp=sc.next();
            	 if(Attendence.contains(emp)) {
            		 System.out.println(emp+" is Present");
            	 }else {
            		 System.out.println(emp+" is Absent");
            	 }
            	 break;
             case 3:
            	 int per_hr=20; int hrs=8;
            	 System.out.println("Enter the name of the employee");
            	 String emp1=sc.next();
             	 float wage=per_hr*hrs;
             	 System.out.println(emp1+" wage is: "+wage);
            	 
             }
             }}
                   
	} 
	
	////---------- Methods start here
	public static void seeAttendence() {
	System.out.println("Employees today present are :"+Attendence);
	}
}
