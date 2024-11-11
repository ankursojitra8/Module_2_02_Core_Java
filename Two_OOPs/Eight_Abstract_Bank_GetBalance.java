/* Que. - 8.  Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively.
 'BankA', 'BankB' and 'BankC'are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each 
 of the three classes.
 */
package Two_OOPs;

abstract class Bank 
{
    abstract double getBalance();
}

class BankA extends Bank 
{
    double getBalance() 
    {
        return 100.0;
    }
}

class BankB extends Bank 
{
    double getBalance() 
    {
        return 250.0;
    }
}

class BankC extends Bank 
{
    double getBalance() 
    {
        return 500.0;
    }
}

public class Eight_Abstract_Bank_GetBalance 
{
    public static void main(String[] args) 
    {
        Bank bankA=new BankA();
        Bank bankB=new BankB();
        Bank bankC=new BankC();

        System.out.println("-->> Balance In Bank A : $" + bankA.getBalance());
        System.out.println("-->> Balance In Bank B : $" + bankB.getBalance());
        System.out.println("-->> Balance In Bank C : $" + bankC.getBalance());
    }
}
