package loop;
import java.util.Scanner;
class composit
{
    public static void main(String[]args)
    {
       int a,c=0;
       Scanner in=new Scanner (System.in);
       System.out.println("ENTER A");
       a=in.nextInt();
       for (int i=1;i<=a;i++)
       {
           if (a%i==0)
           {
              c++;   
           }
       }
       if (c>2)
       {
          System.out.println("its a composit no");
       }
       else
       {
           System.out.println("its not a composit no");
        }
    }
}