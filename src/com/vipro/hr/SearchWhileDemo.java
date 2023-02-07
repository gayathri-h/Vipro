package com.vipro.hr;

import java.util.Scanner;

public class SearchWhileDemo {

	public static void main(String[] args) {

		int[] nums = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < nums.length; i++)
		{
			System.out.println("please enter the number");
			nums[i] = sc.nextInt();
		}
		
		while(true)
		{
			System.out.println("enter number to search or -1 to quit");
			int searchNumb = sc.nextInt();
			
			if(searchNumb == -1)
			{
				System.out.println("application exiting");
				break;
			}
		
		
		boolean found = false;
		
		for(int i = 0; i < nums.length; i++)
		{
			if(searchNumb == nums[i])
			{
				found = true;
				break;
			}
		}
		if(found)
		{
			System.out.println(searchNumb + "found");
		}
		else
		{
			System.out.println(searchNumb + "not found");
		}
		}
		
		sc.close();
	}
}
