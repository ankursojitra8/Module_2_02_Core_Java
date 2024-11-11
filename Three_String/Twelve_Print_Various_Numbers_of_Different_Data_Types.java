/* 12. Create a class named 'Print Number' to print various numbers of different data types  by creating different methods with the same name 'printn'
  having a parameter for each data type. 
  
  • Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character 
 parameters. For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form 
 (char c, int n). 
 */
package Three_String;

public class Twelve_Print_Various_Numbers_of_Different_Data_Types 
{
    public static void main(String[] args) 
    {
        PrintNumber pn=new PrintNumber();

        pn.printn(10);
        pn.printn(5.5);
        pn.printn('A');
        pn.printn("Hello World");

        pn.printn(20, 'B');
        pn.printn('C', 30);
    }
}

class PrintNumber 
{
    void printn(int n) 
    {
        System.out.println("-->> Integer : " + n);
    }

    void printn(double d) 
    {
        System.out.println("-->> Double : " + d);
    }

    void printn(char c) 
    {
        System.out.println("-->> Character : " + c);
    }

    void printn(String s) 
    {
        System.out.println("-->> String : " + s);
    }

    void printn(int n, char c) 
    {
        System.out.println("-->> Integer : " + n + ", Character : " + c);
    }

    void printn(char c, int n) 
    {
        System.out.println("-->> Character : " + c + ", Integer : " + n);
    }
}
