/* Que. - 3. Create a class named 'Member' having the following members:
				1. Data members
				2. Name
				3. Age
				4. Phone number
				5. Address
				6. Salary
	It also has a method named 'printSalary' which prints the salary of the members.
 */
package Two_OOPs;

public class Three_Print_Member_Salary 
{
	class Member 
	{
	    String name;
	    int age;
	    String phoneNumber;
	    String address;
	    double salary;

	    Member(String name, int age, String phoneNumber, String address, double salary) 
	    {
	        this.name=name;
	        this.age=age;
	        this.phoneNumber=phoneNumber;
	        this.address=address;
	        this.salary=salary;
	    }

	    // Method to print the salary of the member
	    void printSalary() 
	    {
	        System.out.println("-->> Salary Of " +name+ " : $" +salary);
	    }
	}
}
