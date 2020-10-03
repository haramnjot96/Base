package new_practise;

import java.util.*;

public class Basic {
	
	static void sumNum(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static int subNum(int a,int b)
	{
		int c=a-b;
		
		System.out.println(c);
		return c;
	}
	static int divNum(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
		
		return c;
	}
	static int mulNum(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
		
		return c;
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	int a=s.nextInt();
	int b=s.nextInt();
	
	System.out.println("Submition of the numbers are :");
	sumNum(a,b);
	
	System.out.println("Subtraction of the numbers are :");
	subNum(a,b);
	
	System.out.println("Multiplication of the numbers are :");
	mulNum(a,b);
	
	System.out.println("Division of the numbers are :");
	divNum(a,b);
}
}
