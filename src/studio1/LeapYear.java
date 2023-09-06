package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int whyear = in.nextInt();
		boolean isyear = ((whyear%4 == 0) && (whyear%100 != 0)) || (whyear%400 == 0);
		System.out.print(whyear + " is a leap year: " + isyear);
	}

}
