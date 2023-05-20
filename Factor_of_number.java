package Numbers_programming;

import java.util.Scanner;

public class Factor_of_number {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num=sc.nextInt();
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
