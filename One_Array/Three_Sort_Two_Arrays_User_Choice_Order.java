// 3. Write A Java Program to take two Array input from user and sort them in ascending or descending order as per user’s choice.

package One_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Three_Sort_Two_Arrays_User_Choice_Order 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        
        System.out.print("-> Enter Size Of First Array : ");
        int size1=sc.nextInt();
        int[] arr1=new int[size1];
        System.out.print("-> Enter Elements Of First Array : ");
        for (int i=0; i<size1; i++)arr1[i]=sc.nextInt();

        System.out.print("-> Enter Size Of Second Array : ");
        int size2=sc.nextInt();
        int[] arr2=new int[size2];
        System.out.print("-> Enter Elements Of Second Array : ");
        for (int i = 0; i<size2; i++) arr2[i]=sc.nextInt();
        
        System.out.print("-> Enter Any Key For Sorting Order (Ascending/Descending) : "); 
        String order=sc.next();
        
        if (order.equalsIgnoreCase("asc"))  // Sort arrays based on user choice
        {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
        } 
        else 
        {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            reverseArray(arr1);
            reverseArray(arr2);
        }
        
        System.out.println("-->> Sorted First Array: " + Arrays.toString(arr1));
        System.out.println("-->> Sorted Second Array: " + Arrays.toString(arr2));
    }

    private static void reverseArray(int[] arr) 
    {
        for (int i=0, j=arr.length-1; i<j; i++, j--) 
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
	}
}
