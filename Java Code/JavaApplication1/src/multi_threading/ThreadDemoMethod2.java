
package multi_threading;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadDemoMethod2 {
    public static void main(String[] args) {
        
        D d = new D();
     Thread t1 = new Thread(d);   
     t1.start();
     Thread t2 = new Thread(new E());   
     t2.start();
    }
 
}

class D implements Runnable
{
    @Override
    public void run() {
      System.out.println("Thread D starting.....");  
        for (int i = 0; i < 100; i++) { 
            System.out.println("D : " +i);    
            
          try {
              Thread.sleep(1000);
          } catch (InterruptedException ex) {
              System.out.println(ex);
          }
        }
        System.out.println("Thread D completed!!!!");   
    }
    
}

class E implements Runnable
{
    @Override
    public void run() {
      System.out.println("Thread E starting.....");  
        for (int i = 0; i < 100; i++) { 
            System.out.println("E : " +i);    
            
          try {
              Thread.sleep(1000);
          } catch (InterruptedException ex) {
              System.out.println(ex);
          }
        }
        System.out.println("Thread E completed!!!!");   
    }
    
}