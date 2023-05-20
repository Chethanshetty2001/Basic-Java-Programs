package Numbers_programming;

import java.util.Scanner;

public class Armstrong_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num=sc.nextInt();
		int sum=0;
		int copy=num;
		while(num!=0)
		{
			int d=num%10;
			sum=sum+power(d,(int) (count(copy)));
			num=num/10;
		}
		if(sum==copy)
		{
			System.out.println("Armstrong Number");
		}
		else{
			System.out.println("Not Armstrong Number");
		}
		
	}

	static int count(int copy) {
		int count=0;
		while(copy!=0)
		{
			copy=copy/10;
			count ++;
			
		}
		return count;

	}
	 static int power(int base,int exp) {
		int res=1;
		while(exp!=0)
		{
			res=res*base;
			exp --;
		}
		return res;
	}
 

}
