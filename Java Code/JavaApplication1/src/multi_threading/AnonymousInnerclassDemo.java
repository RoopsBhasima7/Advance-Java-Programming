
package multi_threading;


public class AnonymousInnerclassDemo {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(){
            @Override
            public void run()
            {
              for (int i = 0; i < 100; i++) { 
            System.out.println("D : " +i);    
            
          try {
              Thread.sleep(1000);
          } catch (InterruptedException ex) {
              System.out.println(ex);
          }  
            }
          }
        };
        t1.start();
    }
}
