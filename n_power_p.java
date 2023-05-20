package Numbers_programming;

import java.util.Scanner;

public class n_power_p {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int base=sc.nextInt();
		int exe=sc.nextInt();
		int res=1;
		while(exe!=0)
		{
			res=res*base;
			
			exe--;
		}
		
		System.out.println(res);
	}

}
