// Que. - 3. W.A.J.P to create 2 threads and execute that threads by providing sleep time as 2000ms and check the execution.
package Five_Multithreading;

class ThreadWithSleep extends Thread 
{
    private String threadName;

    ThreadWithSleep(String name) 
    {
        this.threadName=name;
    }

    public void run() 
    {
        try 
        {
            System.out.println(threadName+" Is Sleeping...");
            Thread.sleep(2000);
            System.out.println(threadName+" Has Awakened!");
        } 
        
        catch (InterruptedException e) 
        {
            System.out.println(threadName+"---->> Was Interrupted.");
        }
    }
}

public class Three_Two_Threads_With_Sleep_Time {
    public static void main(String[] args) {
        ThreadWithSleep thread1=new ThreadWithSleep("-->> Thread 1");
        ThreadWithSleep thread2=new ThreadWithSleep("-->> Thread 2");

        thread1.start();
        thread2.start();
    }
}
