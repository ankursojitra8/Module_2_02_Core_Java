/* Que. - 1. Write a Java program to count the letters, spaces, numbers and other characters of  an input string.
 */
package Three_String;
import java.util.Scanner;

public class One_Count_Letters_Spaces_Numbers_Chars 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("-> Enter A String : ");
        String input = scanner.nextLine();

        int letters=0, spaces=0, numbers=0, others=0;
        
        for (char ch:input.toCharArray()) 
        {
            if (Character.isLetter(ch)) 
            {
                letters++;
            } 
            else if (Character.isDigit(ch)) 
            {
                numbers++;
            } 
            else if (Character.isWhitespace(ch)) 
            {
                spaces++;
            }
            else 
            {
                others++;
            }
        }

        System.out.println("-->> Letters : "+letters);
        System.out.println("-->> Spaces : "+spaces);
        System.out.println("-->> Numbers : "+numbers);
        System.out.println("-->> Other Characters : "+others);
    }
}

