// Que. - 1. W.A.J. P to create one thread by implementing Runnable interface in Class.
package Five_Multithreading;

class One_Thread_By_Implementing_Runnable implements Runnable 
{
    public void run() 
    {
        System.out.println("-->> Thread Is Running!");
    }

    public static void main(String[] args) 
    {
        Thread thread=new Thread(new One_Thread_By_Implementing_Runnable());
        thread.start();
    }
}
