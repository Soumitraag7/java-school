package while_statement;
import java.util.Scanner;
class neo
{
    public static void main (String args[])
    {
         Scanner in=new Scanner (System.in);
         int a,b,c,d,e=1;
         System.out.println("Enter a number");
         a=in.nextInt();
         b=a*a;
         while(b>0)
         {
             
             c=b%10;
             d=b/10;
             e=c+d;
            }
            //if (add==a)
            //{
               // System.out.println("Its a neo no.");
           // }
            //else
            //{
                //System.out.println("Its not a neo no.");
            //}
            System.out.println(e);
        }
    }