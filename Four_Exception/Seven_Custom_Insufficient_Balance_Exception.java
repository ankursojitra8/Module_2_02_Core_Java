/* Que. - 7. W.A.J.P to create a custom exception if Customer withdraw amount which is greater  than account balance then program will show custom 
 exception otherwise amountwill deduct from account balance. Account balance is: 2000 Enter withdraw amount: 2500
 
-->> Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.
*/
package Four_Exception;

//Custom exception class
class InsufficientBalanceException extends Exception 
{
	 public InsufficientBalanceException(String message) 
	 {
	     super(message);
	 }
}
	
	public class Seven_Custom_Insufficient_Balance_Exception 
	{
	 private static final int ACCOUNT_BALANCE=2000;
	
	 public static void main(String[] args) 
	 {
	     int withdrawAmount=2500;
	
	     try 
	     {
	         withdraw(withdrawAmount);
	     } 
	     
	     catch (InsufficientBalanceException e) 
	     {
	         System.out.println(e.getMessage());
	     }
	 }

	 public static void withdraw(int amount) throws InsufficientBalanceException 
	 {
	     if (amount > ACCOUNT_BALANCE) 
	     {
	         int def=amount-ACCOUNT_BALANCE;
	         throw new InsufficientBalanceException("-->> Sorry, Insufficient Balance, You Need More " +def+ " Rs. To Perform This Transaction.");
	     }
	     System.out.println("-->> Withdrawal Successful! Remaining Balance: " + (ACCOUNT_BALANCE-amount));
	 }
}

