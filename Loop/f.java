package while_statement;
import java.util.Scanner;
class f
{
    public static void main (String args[])
    {
         Scanner in=new Scanner (System.in);
         int a,b,c=0,d=0,e;
         System.out.println("Enter a number");
         a=in.nextInt();
         b=a*a;
         while(b>0)
         {
             c=b%10;
             d=b/10;
             b=b/10;
             a=a/10;
            }
            
            System.out.println(""+(c+d));
        }
    }