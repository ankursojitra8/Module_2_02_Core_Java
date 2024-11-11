/* Que. - 2. Write a Java program to print the ASCII value of a given character.
 */
package Three_String;
import java.util.Scanner;

public class Two_Print_ASCII_Value_Of_Character 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("-> Enter A Character : ");
        char character=scanner.next().charAt(0);

        int asciiValue=(int) character;
        System.out.println("-->> The ASCII Value Of '" + character + "' Is : " + asciiValue);
    }
}

