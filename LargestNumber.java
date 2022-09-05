import java.util.Scanner;
public class LargestNumber
{ 
  public static void main(String[] args)
  {
    int a=20,b=30,c=15;
    int largest=((a>b&&a>c)?a:(b>a&&b>c)?b:c);
    System.out.println(largest + "is the largest");
  }
}