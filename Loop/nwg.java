package loop;
import java.util.Scanner;
class nwg
{
    public static void main(String[]args)
    {
       int a=1,s1=0,s2=0;
       Scanner in=new Scanner (System.in);
       /*System.out.println("ENTER A");
       a=in.nextInt();*/
       while(a!=0)
       {
           System.out.println("enter a no");
           a=in.nextInt();
           
              if(a%2==0 && a>0)
              {
               s1=s1+a;
              }
              else if(a%2!=0 && a<0)
              {
                s2=s2+a;
              }
           
          
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}