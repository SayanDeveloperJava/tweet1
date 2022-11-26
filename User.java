package com.java.foodorderapp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	
	public static void guestUserMenu(SignUp sup,SignIn sin,ForgetPassword fp) {
		while(true) {
			System.out.println("1.Register 2.Login 3.Forgot Password");
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			switch (ch) {
		      case 1:
		    	  sup.signUp(); 
		        break;
		      case 2:
		        sin.signIn();
		        if(sin.flag==1) {
		        	User.menuForLoggedInUser(sup,sin,fp);
		        }
		        break;
		      case 3:
		        fp.forgetPassword();
		        break;
		        
		      default:
		    	    System.out.println("please choose a valid options");  
		      
		   
			}
			
		}
	}
	
public static void menuForLoggedInUser(SignUp sup,SignIn sin,ForgetPassword fp) {
		
		while(true) {
			System.out.println(" 1.View all food items 2.Reset password 3.Logout");
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			int ch1=sc.nextInt();
			switch (ch1) { 
		      case 1:
		    	  System.out.println("-------------all food items is here------------" );
		    	  ViewAllFoodItems.viewAllFoodItems();
			        break; 
		      case 2:
			        ResetPassword.resetPassword();
			        break;  
		      case 3:
			        System.out.println("logout successfully");
			        User.guestUserMenu(sup,sin,fp);
			        
			        break;
		        
		      default:
		    	    System.out.println("please choose a valid options");  
		      
		   
			}
			
		}
		

	}


	public static void main(String[] args) {
		
		SignUp sup=new SignUp();
		SignIn sin=new SignIn();
		ForgetPassword fp=new ForgetPassword();
		User.guestUserMenu(sup,sin,fp);
		
			
	}

}
