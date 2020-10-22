package new_practise;

import java.util.*;

public class Random_input_into_array {

	static int [] arrayConversion(int a[],int number,int l)
	{
		int i=0;
		while(l != 0)
		{
			int b=0;
			b=number%10;
			number=number/10;
			l--;
			a[i]=b;
			i++;
		}
		return a;
	}
	static void sortingArray(int b[],int l)
	{
		int temp,i;
		for(i=0;i<l-1;i++)
		{		
			for(int j=i+1;j<l;j++)
			{
				if(b[i]>b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}		
	}
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		
		int l = String.valueOf (number).length ();
		int a[]=new int[l];

		int b[]=arrayConversion(a, number,l);
		
		for(int i=0;i<l;i++)
		{
			System.out.println(b[i]);
		}
		sortingArray(b,l);
		for(int i=0;i<l;i++)
		{
			System.out.println(b[i]);
			
		}
		String str=new String(int b[]);
		
	}
}
