// 2. Write a java program to find out the 2nd max number from given array using function.

package One_Array;

public class Two_Find_Second_Max_In_Array
{
	 public static int findSecondMax(int[] arr)
	 {
	        int max=Integer.MIN_VALUE;
	        int secondMax=Integer.MIN_VALUE;

	        for (int num:arr)
	        {
	            if(num>max)
	            {
	                secondMax=max;  
	                max=num;        
	            } 
	            else if(num>secondMax && num!=max) 
	            {
	                secondMax=num;  
	            }
	        }
	        return secondMax;
	    }

	    public static void main(String[] args) 
	    {
	        int[] array={10, 25, 6, 98, 45, 77, 89}; 
	        int secondMaxNumber=findSecondMax(array);
	        System.out.println("-->> The Second Maximum Number In The Array Is: "+secondMaxNumber);
	    }
}
