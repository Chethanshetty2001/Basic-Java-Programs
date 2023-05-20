package Logical_progarmming;

import java.util.Scanner;

public class Strong_no {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num=sc.nextInt();
		int sum=0;
		int fact=1;
		int copy=num;
		while(num!=0)
		{
			int rem=num % 10;
			int no=rem;
			for(int i=num; i>=1;i--)
			{
				fact=fact*i;
				sum=sum+fact;
				num=num/10;
			}
		}
		if(copy==sum)
		{
			System.out.println("NUMBER IS STRONG");
		}
		else{
			System.out.println("NUMBER IS NOT STRONG");
		}
		
		
	}

}
