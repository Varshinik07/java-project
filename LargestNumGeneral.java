import java.util.*;
public class LargestNumGeneral
{
  public static void main(String[] args)
  {
    int a,b,c,largest,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First Num:");
    a = sc.nextInt();
    System.out.println("Enter Second Num:");
    b = sc.nextInt();
    System.out.println("Enter Third Num:");
    c = sc.nextInt();
    temp = a>b?a:b;
    largest = c>temp?c:temp;
    System.out.println("The Largest number is :" + largest);
  }
}
