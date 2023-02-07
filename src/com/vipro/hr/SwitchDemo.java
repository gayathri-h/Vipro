package com.vipro.hr;

public class SwitchDemo {

	public static void main(String[] args) {

		int month = 1;		//change the month choice here
		
		switch(month) 
		{
		case 1:
			System.out.println("january");
			break;
			
		case 2:
			System.out.println("february");
			break;
			
		case 3:
			System.out.println("march");
			break;
			
			default:
				System.out.println("invalid month");
				break;
		}
	}

}
