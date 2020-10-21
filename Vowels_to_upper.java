package new_practise;

import java.util.*;

public class Vowels_to_upper {

	static void upper(String str)
	{
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u')
			{
					ans=ans+(char)(ch-32);
			}
			else
			{
				ans=ans+ch;
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		upper(str);
	}
}
