package hdfc.loans.personalloans;

import java.util.Scanner;

public class OneDimenssionArray 
{

	public static void main(String[] args) 
	{
		/*int[] a = {10,20,30,40};
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int asize = sc.nextInt();
		
		int[] a = new int[asize];
		int sum =0;
		
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = sum + a[i];
		}
		System.out.println("Sum of the Array is :" + sum);
	}

}
