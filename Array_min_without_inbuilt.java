package Logical_progarmming;

public class Array_min_without_inbuilt {
	public static void main(String[] args) {
		int [] arr={7,6,5,4,3,2,1};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
