/* Que. - 4. W.A.J.P to start the same Thread twice by calling start () method twice. 
  Test  ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();
*/
package Five_Multithreading;

class TestThreadTwice1 extends Thread 
{
    public void run() 
    {
        System.out.println("-->> Thread Is Running!");
    }
}

public class Four_Try_To_Start_Thread_Twice
{
    public static void main(String[] args) 
    {
        TestThreadTwice1 t1=new TestThreadTwice1();

        t1.start();

        try 
        {
            t1.start();
        } 
        
        catch (IllegalThreadStateException e) 
        {
            System.out.println("-->> Cannot Start The Thread Twice : " +e.getMessage());
        }
    }
}
