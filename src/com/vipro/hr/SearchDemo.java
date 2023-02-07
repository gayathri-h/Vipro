package com.vipro.hr;

import java.util.Scanner;

public class SearchDemo {

	public static void main(String[] args) {


		int[] nums = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < nums.length; i++)
		{
			System.out.println("please enter the number");
			nums[i] = sc.nextInt();
		}
		
			System.out.println("enter number to search");
			int searchNumb = sc.nextInt();
		
		
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
		sc.close();
	}

}
