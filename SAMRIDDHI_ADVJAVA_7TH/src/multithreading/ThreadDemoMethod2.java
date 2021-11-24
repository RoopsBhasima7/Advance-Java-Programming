
package multithreading;
public class ThreadDemoMethod2 {
    public static void main(String[] args) {
      
      Thread t1 = new Thread(new X());
      Thread t2 = new Thread(new Y());
      Thread t3 = new Thread(new Z());
      
      t1.start();
      t2.start();
      t3.start();
      
      System.out.println("Thread Main starting..."); 
     for (int i = 0; i < 10; i++) {
         System.out.println("Main :" +i);         
     }
     System.out.println("Thread Main completed!");
    }
}

class X implements Runnable
{
 @Override
 public void run()
 {
     System.out.println("Thread X starting..."); 
     for (int i = 0; i < 100; i++) {
         System.out.println("x :" +i);         
     }
     System.out.println("Thread x completed!");
 }
}


class Y implements Runnable
{
 @Override
 public void run()
 {
     System.out.println("Thread Y starting..."); 
     for (int i = 0; i < 100; i++) {
         System.out.println("Y :" +i);         
     }
     System.out.println("Thread Y completed!");
 }
}

class Z implements Runnable
{
 @Override
 public void run()
 {
     System.out.println("Thread Z starting..."); 
     for (int i = 0; i < 50; i++) {
         System.out.println("Z :" +i);         
     }
     System.out.println("Thread Z completed!");
 }
}
