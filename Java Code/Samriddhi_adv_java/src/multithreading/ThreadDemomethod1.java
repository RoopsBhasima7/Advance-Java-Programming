
package multithreading;
public class ThreadDemomethod1 {
    public static void main(String[] args) {
      A a = new A();
      B b = new B();
      C c = new C();
      
      a.start();
      b.start();
      c.start();
      System.out.println("Thread Main starting..."); 
     for (int i = 0; i < 10; i++) {
         System.out.println("Main :" +i);         
     }
     System.out.println("Thread Main completed!");
    }
}

class A extends Thread
{
 @Override
 public void run()
 {
     System.out.println("Thread A starting..."); 
     for (int i = 0; i < 100; i++) {
         System.out.println("A :" +i);         
     }
     System.out.println("Thread A completed!");
 }
}


class B extends Thread
{
 @Override
 public void run()
 {
     System.out.println("Thread B starting..."); 
     for (int i = 0; i < 100; i++) {
         System.out.println("B :" +i);         
     }
     System.out.println("Thread B completed!");
 }
}

class C extends Thread
{
 @Override
 public void run()
 {
     System.out.println("Thread C starting..."); 
     for (int i = 0; i < 50; i++) {
         System.out.println("C :" +i);         
     }
     System.out.println("Thread C completed!");
 }
}
