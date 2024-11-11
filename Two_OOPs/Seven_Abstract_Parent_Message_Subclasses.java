/* Que. - 7. Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' 
 that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.
 */
package Two_OOPs;

abstract class Parent 
{
    abstract void message();
}

class FirstSubclass extends Parent 
{
    void message() 
    {
        System.out.println("-->> This Is The First Subclass");
    }
}

class SecondSubclass extends Parent 
{
    void message() 
    {
        System.out.println("-->> This Is The Second Subclass");
    }
}

public class Seven_Abstract_Parent_Message_Subclasses 
{
    public static void main(String[] args) 
    {
        Parent first=new FirstSubclass();
        Parent second=new SecondSubclass();

        first.message();
        second.message();
    }
}
