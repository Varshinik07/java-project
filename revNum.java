public class revNum
{
 public static void main(String[] args)
 {
   int num = 1234;
   int revNum = 0;
   int digit;

   while(num !=0)
   {
     digit = num % 10;
     revNum = revNum *10 + digit;
     num = num / 10;
   }
     System.out.println("Reverse Number:" +revNum);
 }
}