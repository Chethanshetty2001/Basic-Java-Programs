package Logical_progarmming;

public class Array_max_without_inbuilt {
	public static void main(String[] args) {
		int [] arr={8,6,5,3,2,1,4,7};
		int max=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
