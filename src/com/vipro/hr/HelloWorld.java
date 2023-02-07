package com.vipro.hr;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("please enter your name");
			
			String name = sc.nextLine();
			
			System.out.println("please enter your age");
			
			int age = sc.nextInt();
			
			// System.out.println("Your name is " + name + " and your age is " + age);
			
			if( age <=16)
			{
				System.out.println("Hello " + name + " you are too young to use java");
			}
			else if ( age >=60 )
			{
				System.out.println("Hello " + name + " you are too old to use java");
			} 
			
			else {
				System.out.println("Hello " + name + " Welcome to java");
			}
			
			sc.close();
			
	}

}
