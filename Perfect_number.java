package Numbers_programming;

import java.util.Scanner;

public class Perfect_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num=sc.nextInt();
		int sum=0;
		int copy=num;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(copy==sum)
		{
			System.out.println("Perfect Number");
		}
		else{
			System.out.println("Not Perfect Number");
		}
	}

}
