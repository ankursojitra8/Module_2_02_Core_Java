// Que. - 1. W.A.J.P to demonstrate try catch block.

package Four_Exception;

public class One_Try_Catch_Block_Demo 
{
    public static void main(String[] args) 
    {
        try 
        {
            int result=10/0; // This will throw an ArithmeticException
        } 
        
        catch (ArithmeticException e) 
        {
            System.out.println("-->> Error : Cannot Divide By Zero !");
        }
    }
}

