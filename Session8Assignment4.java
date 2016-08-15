

class ChildThread extends Thread
{
     ChildThread()
     {
          super("my extending thread");
          System.out.println("my thread created" + this);
          start();
     }

   public void run()
   {
        try
        {
             for (int i=0 ;i <= 10;i++)
             {
                   System.out.println("Printing the count " + i);
                   Thread.sleep(1000);
              }
         }
       catch(InterruptedException e)
        {
                 System.out.println("My thread interrupted");
        }

       System.out.println("My thread run is over" );
   }
}


public class Session8Assignment4
{
    public static void main(String [] args) 
    {
          ChildThread ct = new ChildThread();
      try
      {
         while(ct.isAlive())
         {
           System.out.println("Main thread will be alive till the child thread is live");
           Thread.sleep(1500);
         }
      }
      catch(InterruptedException e)
      {
        System.out.println("Main thread interrupted");
      }
      System.out.println("Main thread's run is over" );     
          
   }
}