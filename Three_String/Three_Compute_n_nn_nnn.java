/* Que. - 3. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Input number: 5
5 + 55 + 555
 */
package Three_String;
import java.util.Scanner;

public class Three_Compute_n_nn_nnn 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("-> Enter An Integer (n) : ");
        int n=scanner.nextInt();

        int nn=Integer.parseInt(n + "" + n);
        int nnn=Integer.parseInt(n + "" + n + "" + n);
        int result=n+nn+nnn;

        System.out.println("-->> Result Of " + n + " + " + nn + " + " + nnn + " Is : " + result);
    }
}
