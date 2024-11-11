/* Que. - 5. W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set  Daemon () method of Thread class and check whether the 
 thread is set daemon or not by using is Daemon () method. 
 
 		TestDaemonThread2 t1=new TestDaemonThread2();
		TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
		t1.setDaemon(true);                //will throw exception here t2.start();
*/
package Five_Multithreading;

class TestDaemonThread2 extends Thread 
{
    public void run() 
    {
        System.out.println(getName()+" Is Running!");
    }
}

public class Five_Daemon_Thread_Example 
{
    public static void main(String[] args) 
    {
        TestDaemonThread2 t1=new TestDaemonThread2();
        TestDaemonThread2 t2=new TestDaemonThread2();

        t1.setDaemon(true);
        t1.start();
        t2.start();

        System.out.println("-->> " +t1.getName()+" Is Daemon: " +t1.isDaemon());
    }
}

