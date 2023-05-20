package Numbers_programming;

import java.util.Scanner;

public class Happy_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num=sc.nextInt();
		while(num>9)
		{
	       int sum=0;
	       
	       do{
	    	   int rem=num%10;
	    	   sum=sum+(rem*rem);
	    	   num =num/10;
	       }
	       while(num!=0);
	       num=sum;
	       
		}
		if(num==1||num==7)
		{
			System.out.println("HAAPY NUMBER");
		}
		else{
			System.out.println("NOT A HAPPY NUMBER");
		}
		
	}

}
