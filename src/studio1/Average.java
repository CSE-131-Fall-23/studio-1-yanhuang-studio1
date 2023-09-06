package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first of two integers to be averaged?");
		int a = in.nextInt();
		System.out.println("The second of two integers to be averaged?");
		int b = in.nextInt();
		double ans;
		ans = 0.5 * (a + b);
		System.out.println("Average of " + a + " and " + b + " is " + ans + ".");
	}

}
