/* Que. - 10. Write a program to print the factorial of a number by defining a method named  'Factorial'. Factorial of any number n is represented 
 by n! And is equal to 1*2*3*.
*(n-1) *n.
E.g.-
-->>     4! = 1*2*3*4 = 24
-->>     3! = 3*2*1 = 6 
-->>     2! = 2*1 = 2 Also, 
-->>     1! = 1 0! = 0
 */
package Two_OOPs;

import java.util.Scanner;

public class Ten_Factorial_Method_Calculate 
{
    static long Factorial(int n) 
    {
        if (n==0 || n==1) 
        {
            return 1;
        }
        long result=1;
        for (int i=2; i<=n; i++) 
        {
            result*=i; // Calculate factorial
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("-->> Enter A Number To Calculate Its Factorial : ");
        int number=scanner.nextInt();

        long factorial=Factorial(number);
        System.out.println(number + "! = " + factorial);
    }
}
