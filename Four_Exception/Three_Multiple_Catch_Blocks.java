/* Que. - 3. W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero  exception and another one is to handle 
 ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;
*/

package Four_Exception;

public class Three_Multiple_Catch_Blocks 
{
	public static void main(String[] args) 
	{
		int[] a=new int[5];

		try 
		{
			a[5]=30/0;
		} 
     
		catch (ArithmeticException e) 
		{
			System.out.println("Exception : Division By Zero!");
		} 
     
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Exception: Array Index Out Of Bounds!");
		}

		for (int i:a) 
		{
			System.out.print(i + " ");
		}
	}
}
