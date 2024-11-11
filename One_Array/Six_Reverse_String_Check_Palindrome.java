// 6.  Write a java program to reverse a string and check that the string is palindrome or not.

package One_Array;

import java.util.Scanner;

public class Six_Reverse_String_Check_Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.print("-> Enter a string: ");
        String str=sc.nextLine();
        
        String reversed = "";
        for (int i=str.length()-1; i>=0; i--) 
            reversed+=str.charAt(i);
        
        System.out.println("-->> Reversed String: " + reversed);
        System.out.println("-->> Is Palindrome: " + str.equalsIgnoreCase(reversed));
	}
}
