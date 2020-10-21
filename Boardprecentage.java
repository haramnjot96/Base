package new_practise;

import java.util.*;

public class Boardprecentage {
	static int percentageBoard(int a1,int a2,int a3,int a4,int a5)
	{
		int sum=(a1+a2+a3+a4+a5);
		double per=sum/5;
		System.out.println(per);
		return 0;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Good Name");
		String str=s.nextLine();
		
		System.out.println("Enter your marks in 5 main subject one by one out of 100");
		
		System.out.println("Enter the marks of first subject");
		int a1=s.nextInt();
		
		System.out.println("Enter the marks of second subject");
		int a2=s.nextInt();
		
		System.out.println("Enter the marks of 3rd subject");		
		int a3=s.nextInt();
		
		System.out.println("Enter the marks of 4th subject");
		int a4=s.nextInt();
		
		System.out.println("Enter the marks of 5th subject");
		int a5=s.nextInt();
		
		System.out.println("The percantge of "+str+" is: ");
		percentageBoard(a1,a2,a3,a4,a5);
	}
}
