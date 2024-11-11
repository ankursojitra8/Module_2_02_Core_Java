// 5. Write a java program Find out length of string without using inbuilt function.

package One_Array;

import java.util.Scanner;

public class Five_Find_String_Length_No_Inbuilt 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.print("-> Enter a string : ");
        String str=sc.nextLine();

        int length=0;
        for (char c:str.toCharArray()) length++;

        System.out.println("-->> Length of the string : " + length);
	}
}
