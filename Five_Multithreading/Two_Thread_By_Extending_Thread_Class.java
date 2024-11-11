// Que. - 2. W.A.J. P to create one thread by extending Thread class in another Class.
package Five_Multithreading;

class Two_Thread_By_Extending_Thread_Class extends Thread 
{
    public void run() 
    {
        System.out.println("-->> Thread is running!");
    }

    public static void main(String[] args) 
    {
        Two_Thread_By_Extending_Thread_Class thread=new Two_Thread_By_Extending_Thread_Class();
        thread.start();  // Start the thread
    }
}
