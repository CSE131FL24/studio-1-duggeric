package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		System.out.println("What year would you like to know is a leap?");
		int n1 = in.nextInt();
		boolean isOrdered = n1%4==0 && n1%100!=0|| n1%400==0;
		System.out.println(n1+ "is a leap year:" + isOrdered);
	}
		// TODO Auto-generated method stub

	}

