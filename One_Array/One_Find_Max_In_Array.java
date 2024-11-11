// 1. Write a java program to find out the max number from given array using function

package One_Array;

public class One_Find_Max_In_Array
{
    public static int findMax(int[] arr) 
    {
        int max=arr[0];
        for (int i=1; i<arr.length; i++) 
        {
            if (arr[i]>max) 
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) 
    {
        int[] array={10, 20, 30, 98, 45, 77, 89};
        int maxNumber=findMax(array);
        System.out.println("-->> The Maximum Number In The Array Is: "+maxNumber);
    }
}
