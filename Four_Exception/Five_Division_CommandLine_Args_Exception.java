/* Que. - 5. W.A.J. P to demonstrate try catch block, take two numbers from the user by Command line argument and perform the division operation and 
 handle Arithmetic 
 
 -->>  O/P- 
 Exception in thread main java. Lang. Arithmetic Exception:/ by zero
*/
package Four_Exception;

public class Five_Division_CommandLine_Args_Exception 
{
	 public static void main(String[] args) 
	 {
	     if (args.length<2) 
	     {
	         System.out.println("-->> Please Provide Two Numbers As Command Line Arguments.");
	         return;
	     }
	
	     try 
	     {
	         int num1=Integer.parseInt(args[0]);
	         int num2=Integer.parseInt(args[1]);
	
	         int result=num1/num2;
	         System.out.println("-->> Result : " + result);
	     } 
	     
	     catch (ArithmeticException e) 
	     {
	         System.out.println("-->> Exception In Thread \"main\" java.lang.ArithmeticException: / By Zero");
	     } 
	     
	     catch (NumberFormatException e) 
	     {
	         System.out.println("-->> Please Provide Valid Integers.");
	     }
	 }
}
