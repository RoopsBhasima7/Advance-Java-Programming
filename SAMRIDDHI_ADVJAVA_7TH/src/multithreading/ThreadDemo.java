
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadDemo {
    
    public static void main(String[] args) {
         Thread t1 = new Thread(){         
         @Override
         public void run()
         {
             for (int i = 0; i < 10; i++) {
                 try {
                     Thread.sleep(1000);                  
                     System.out.println(i);
                 } catch (InterruptedException ex) {
                     Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
                 }
             } 
         }
         };
         t1.start();
       
    }
}
