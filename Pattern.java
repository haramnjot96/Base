package new_practise;

import java.util.*;

public class Pattern {

	static void singlePattern(int a)
	{
		System.out.println("Simple pattern");
		for (int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if(i<j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	static void diamondPattern(int a)
	{
		System.out.println("Diamond");
		int n=(a*2)-1;
		int k=0,i;
		for(i=1;i<=n;i++)
			{
			
				if(i<=a)
					k++ ;
				else 
					k--;
				for(int j=1;j<=n;j++)
				{
					if(j<a+k && j>a-k)
						System.out.print("*");
					else
						System.out.print(" ");
					}
				System.out.println();
			}
	}
		static void pyramidPattern(int a)
		{
			System.out.println("Pyramid");
			int n=(2*a)-1;
			for(int i=1;i<=a;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(j>a-i && j<=(a-1)+i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
		static void daimondEmpty(int a)
		{
			System.out.println("Empty diamond");
			int n=(a*2)-1;
			int k=0,i;
			for(i=1;i<=n;i++)
			{
				if(i<=a)
				{
					k++;
				}
				else
					k--;
			for(int j=1;j<=n;j++)
			{
				if(j<a+k-1 && j>a-k+1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			}
		}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		singlePattern(a);
		pyramidPattern(a);
		diamondPattern(a);
		daimondEmpty(a);
	}
}
