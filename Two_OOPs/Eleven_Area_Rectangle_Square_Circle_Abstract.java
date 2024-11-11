/* Que. - 11. Write a program to print the factorial of a number by defining a method named
'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
*(n-1) *n.E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6 2! = 2*1 = 2 Also, 1! = 1 0! = 0
 */
package Two_OOPs;

import java.util.Scanner;

public class Eleven_Area_Rectangle_Square_Circle_Abstract 
{

    // Method to calculate factorial
    static int Factorial(int n) 
    {
        int factorial=1;
        for (int i=1; i<=n; i++) 
        {
            factorial*=i;
        }
        return factorial;
    }

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("-> Enter A Number To Find Its Factorial: ");
        int number=scanner.nextInt();

        int result=Factorial(number);
        System.out.println("-->> Factorial Of " + number + " is: " + result);
    }
}
