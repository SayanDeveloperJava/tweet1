package com.tweetapp;

import java.util.Scanner;


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
				System.out.println("1.Post a tweet 2.View all your tweets 3.View all tweets"
						+ " 4.View all users 5.Reset password 6.Logout");
				System.out.println("Enter your choice");
				Scanner sc=new Scanner(System.in);
				int ch1=sc.nextInt();
				switch (ch1) { 
			      case 1:
			    	  PostTweet.postATweet();
			        break;
			      case 2:
			    	  System.out.println("your tweets is here");
			    	  ViewAllYourTweets.viewAllYourTweets();
			        break;
			      case 3:
			    	  System.out.println("all user tweets is here");
			    	  ViewAllUserTweets.viewAllUserTweets();
			        break;
			      case 4:
			    	  System.out.println("Say hi to all users");
			    	  ViewAllUsers.viewAllUser();
				        break; 
			      case 5:
				        ResetPassword.resetPassword();
				        break;  
			      case 6:
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
