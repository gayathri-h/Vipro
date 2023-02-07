package com.vipro.hr;

import java.util.Scanner;

public class NumbDemo {

	public static void main(String[] args) {

		int[] nums = new int[25];
		Scanner sc = new Scanner(System.in);
		String choice = "";
		int index = 0;
		
		do
		{
			System.out.println("please select your choice");
			System.out.println(" 1.Add a number to the array");
			System.out.println("2.Display all the numbers");
			System.out.println("3.Search a number");
			System.out.println("4.Delete a number");
			System.out.println("5.Exit");
			
			choice = sc.next();	//it will come in loop if missed
			
			switch(choice)
			{
			case"1":
				System.out.println("please enter a number");
				nums[index] = sc.nextInt();
				index++;
				System.out.println("added successfully");
				break;
				
			case"2":
				for(int i=0; i < index; i++)
				{
					System.out.println(nums[i]);
				}
				break;
				
			case "3":
				System.out.println("enter the number to search");
				int searchNumb = sc.nextInt();
				
				boolean found = false;
				
				for(int i = 0; i < nums.length; i++)
				{
					if (searchNumb == nums[i])	//int == and for string .equals
					{
						found = true;
						break;
					}
				}	
					if (found)
					{
						System.out.println(searchNumb + "found");
					}
					else
					{
						System.out.println("sorry" + searchNumb + "not found");
					}
					break;
					
			case "4":
				System.out.println("enter the number to delete");
				int delNumb = sc.nextInt();
				
				boolean del = false;
				
				for( int i=0 ; i< nums.length; i++)
				{
					if(delNumb == nums[i])
					{
						del = true;
						nums[i] = 0;
						break;
						
					}
				}
				
				 	if(del)
				 	{
				 		System.out.println(delNumb + "deleted");
					}
				 	
				 	else
				 	{
				 		System.out.println("sorry" + delNumb + "is not found");
				 	}
				 	break;
				 	
			case "5":
				System.out.println("Application Exiting");
				break;
				default:
				System.out.println("Invalid choise");
				break;
			}
			
		}while(!choice.equals("5"));
				sc.close();
			
	}

}
