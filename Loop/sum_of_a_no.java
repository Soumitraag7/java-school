package loop;
import java.util.Scanner;
class sum_of_a_no
{
    public static void main(String[]args)
    {
       int a,s=0,b,c=0;
       Scanner in=new Scanner (System.in);
       System.out.println("ENTER A=");
       a=in.nextInt();
       while(a>0)
       {
           c=a%10;
           s=s+c;
           a=a/10;
       }
       System.out.println(s);
    }
}