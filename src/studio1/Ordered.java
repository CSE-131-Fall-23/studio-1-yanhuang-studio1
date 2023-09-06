package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		/*
		boolean is0rdered = true;
		if (x<y && y<z)
		{
			System.out.print(is0rdered);
		}
		else
		{
			if (x>y && y>z)
			{
				System.out.print(is0rdered);
			}
			else
			{
				is0rdered = false;
				System.out.print(is0rdered);
			}
		}
		*/
		
		boolean is0rdered;
		is0rdered = (x>y && y>z) || (x<y && y<z);
		System.out.print(is0rdered);
	}

}
