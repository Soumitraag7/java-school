package loop;
import java.util.Scanner;
class small_big
{
    public static void main(String[]args)
    {
       int a,x,z,max,min;
       Scanner in=new Scanner (System.in);
       System.out.println("ENTER A");
       a=in.nextInt();
       max=a;
       min=a;
       for(x=1;x<10;x++)
       {
           System.out.println("A=");
           a=in.nextInt();
           if(a<min)
           {
               min=a;
            }
           else if(a>max)
           {
               max=a;
           }
       }
       System.out.println(min+" IS THE SMALEST NO");
       System.out.println(max+" IS THE BIGEST NO");
    }
}