/* Que. - 4. W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch
				block. try {
				try
				{//code}
				catch (Exception e)
				{//code}
				catch (Exception e)
				{//code}
*/

package Four_Exception;

public class Four_Nested_Try_Catch_Block 
{
	 public static void main(String[] args) 
	 {
	     int[] a=new int[5];
	
	     try 
	     {
		         try 
		         {
		             a[5]=30/0;
		         } 
		         
		         catch (ArithmeticException e) 
		         {
		             System.out.println("-->> Inner Exception : Division By Zero!");
		         }
	     } 
	     
	     catch (ArrayIndexOutOfBoundsException e) 
	     {
	         System.out.println("-->> Outer Exception: Array Index Out Of Bounds!");
	     }

	     for (int i:a) 
	     {
	         System.out.print(i + " ");
	     }
	 }
}
