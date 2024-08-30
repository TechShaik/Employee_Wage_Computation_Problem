package com.files;

import java.util.Scanner;

public class methods {
	
          Scanner sc=new Scanner(System.in);
	  public void emp_wage() {
		  System.out.println("Enter the Employee name : ");
      	String nm=sc.next();
               int pr = 18;
              int hr = 4; 
              float wage = pr * hr;
              System.out.println(nm + " wage is: " + wage);
              System.out.println();
	    	
	    }

}
