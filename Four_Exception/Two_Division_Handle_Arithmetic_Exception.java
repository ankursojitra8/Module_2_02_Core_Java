/* Que. - 2. Take two numbers from the user and perform the division operation and handle Arithmetic Exception. O/P- Enter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero
*/
package Four_Exception;

import java.util.Scanner;

public class Two_Division_Handle_Arithmetic_Exception 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("-> Enter Two Numbers : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try 
        {
            int result=num1/num2;
            System.out.println("-->> Result : " + result);
        } 
        
        catch (ArithmeticException e) 
        {
            System.out.println("-->> Exception In Thread \"main\" java.lang.ArithmeticException : / By Zero");
        }

    }
}
