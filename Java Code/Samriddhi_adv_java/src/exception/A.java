
package exception;


public class A {
    public static void main(String[] args) {
       B b = new B();
        System.out.println(b);
    }
}

class B 
{
// @Override
// public String toString()
// {
//     return "I am B's object";
// }
 @Override
 public int hashCode()
 {
   return 11111;  
 }
}