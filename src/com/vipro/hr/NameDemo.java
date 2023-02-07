package com.vipro.hr;

import java.util.Scanner;

public class NameDemo {

	public static void main(String[] args) {

		String[] names = new String[25];
		Scanner sc = new Scanner(System.in);
		int index = 0;
		String choice="";
		
		do
		{
			System.out.println("please select the choice");
			System.out.println("1.please add the names");
			System.out.println("2.please display the names");
			System.out.println("3.please search the names");
			System.out.println("4.please delete the names");
			System.out.println("5.exit application");
			
			choice = sc.next();
			
			switch(choice){
			case"1":
				System.out.println("please enter the name");
				names[index] = sc.next();
				index++;
				System.out.println("added successfully");
				break;
				
			case"2":
				for(int i = 0; i < index; i++)
				{
					System.out.println(names[i]);
				}
				break;
				
			case "3":
				System.out.println("please enter the name to search");
				String searchName = sc.next();
				
				boolean search = false;
				for(int i = 0; i < names.length; i++)
				{
					if(searchName.equals(names[i]))	//int == and for string .equals
						{
						search = true;
						break;
						}
				}
				if(search)
				{
					System.out.println(searchName + "found");
				}
				else
				{
					System.out.println(searchName + "not found" );
				}
					break;
					
			case "4":
				System.out.println("please enter the name to delete");
				String delName = sc.next();
				
				boolean del = false;
				for(int i = 0; i < names.length; i++)
				{
					if(delName.equals(names[i]))	//int == and for string .equals
						{
						del = true;
						names[i] = null;
						break;
						}
				}
				if(del)
				{
					System.out.println(delName + "found");
				}
				else
				{
					System.out.println(delName + "not found" );
				}
					break;
					
			case"5":
				System.out.println("application exiting");
				break;
				default:
					System.out.println("invalid choice");
					break;
				
			}
			
				
			
	}while(!choice.equals("5"));
	
	sc.close();
}

}
