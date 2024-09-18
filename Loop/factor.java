package loop;
import java.util.Scanner;
class factor
{
    public static void main(String[]args)
    {
       int a,x,z,n,b;
       Scanner in=new Scanner (System.in);
       System.out.println("ENTER A");
       a=in.nextInt();
       for (int i=1;i<a;i++)
       {
           b=a%i;//=0;
           if(b==0)
           {
             System.out.print(i+",");
           }
        }

    }
}