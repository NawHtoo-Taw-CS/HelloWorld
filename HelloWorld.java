import java.util.Scanner;

public class HelloWorld
{
  public static void main (String[] args)
  {
     int N1,N2,Ans;

   System.out.println ("Hello World! Lets Add Two Numbers Together");
   System.out.println ("Add Your First Number");
   Scanner in = new Scanner(System.in);
   N1 = in.nextInt();
   System.out.println ("Add Your Second Number");
   N2 = in.nextInt();
   Ans = N1+N2;

   System.out.println ("Your Answer Was "+Ans);
 }
}
