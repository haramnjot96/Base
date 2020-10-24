package new_practise;

import java.util.*;

public class Diamondempty {

	static void function(int n)
	{
		int a=(n*2)-1;
		for(int i=1;i<=n;i++)
		{
			char d='a';
			for (int j=1;j<=a;j++)
			{
				if(j<n-1+i && j>n+1-i)
				{
					System.out.print(" ");
				}
				else 
				{
					System.out.print(d);
					
					if(j<n) 
					{
						d++;
					}
					else
					{
						d--;
					}
				}
			}
			System.out.println();
		}
	}
	static void tiltedTriangle(int n)
	{
		int a=(n*2)-1;
		int k=0;
		for(int i=1;i<=a;i++)
		{
			if(i<=n)
			{
				k++;
			}
			else
			{
				k--;
			}
			for(int j=1;j<=n;j++)
			{
				if( j<=k)
				{
				System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		function(n);
		tiltedTriangle(n);
	}
}
