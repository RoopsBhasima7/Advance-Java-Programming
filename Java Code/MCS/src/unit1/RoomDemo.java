
package unit1;

public class RoomDemo {
    public static void main(String[] args) {
     Room r1  = new Room();
     r1.getArea();
    
    }
    
}
class Room
{
 int l , b;

 public Room()
 {
   this(10,12)  ;
 }
    private Room(int l, int b) {
        this.l = l;
        this.b = b;
    }
 public void getArea()
 {
     System.out.println("Area of Room : " + (l*b));
 }
}