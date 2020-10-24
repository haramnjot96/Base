package new_practise;

import java.util.*;

public class String_reverse {

	static String function(String str)
	{
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		return str1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str="Harman",str2="";
		str2 =function(str);
		System.out.println(str2);
	}
}
