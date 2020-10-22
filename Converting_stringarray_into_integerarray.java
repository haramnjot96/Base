package new_practise;

import java.util.Arrays;

public class Converting_stringarray_into_integerarray {

	public static void main(String[] args) {
		
		String [] str= {"123","432","234"};
		int size=str.length;
		int  arr[]= new int [size];
		for(int i=0;i<size;i++)
		{
			arr[i]=Integer.parseInt(str[i]);
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
