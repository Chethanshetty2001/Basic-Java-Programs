package Logical_progarmming;

import java.util.Scanner;

public class Prime_no_dynamic_input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count ++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime_Number");
		}
		else{
			System.out.println("Palindrome_Number");
		}
	}

}
