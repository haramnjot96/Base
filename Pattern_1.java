package new_practise;

import java.util.*;

public class Pattern_1 {

	static void withNumber(int n)
	{
		int a=(n*2)-1;
		for(int i=1;i<=n;i++)
		{
			int d=1;
			for (int j=1;j<=a;j++)
			{
				
				if(j>=n+1-i && j<=(n-1)+i)
				{
					System.out.print(d);
					if(j<n) 
						d++;
					else
						d--;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void patternAlphabet(int n)
	{
		System.out.println();
		int a=(n*2)-1;
		int i,k=0;
		for(i=1;i<=a;i++)
		{
		
			if(i<=n)
				k++ ;
			else 
				k--;
			char d='a';
			for(int j=1;j<=a;j++)
			{
				if(j<n+k && j>n-k)
				{	System.out.print(d);
					if(j<n)
						d++;
					else
						d--;
				}
				else
					System.out.print(" ");
				}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=4;
		withNumber(n);
		patternAlphabet(n);
	}
}
