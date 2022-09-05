public class SwapWithoutTemp
 {
   public static void main(String[] args)
   {
     int x=10;
     int y=20;
     x=x-y;
     y=x+y;
     x=y-x;
     System.out.println("x value After swapping:"+x);
     System.out.println("y value After swapping:"+y);
   }
}