
package multi_threading;
//Thread synconization 
public class SynThreadDEmo {
    public static void main(String[] args) {
        
    }
    
}

class X extends Thread
{
   @Override
   public void run()
   {
       System.out.println("X :");   
   }
}
class Y extends Thread
{
   @Override
   public void run()
   {
     System.out.println("Y :");     
   }
}
class Z 
{
    public void abc()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            
        }
   
    }
}