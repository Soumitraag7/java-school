import java.util.Scanner;
class even_odd
{
    public static void main (String args[])
    {
        int a,b=2,c=-2;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A POSITIVE EVEN NO TO GET ITS SUCCEDING THREE EVEN NO OR ENTER A NEGATIVE ODD NO TO GET ITS THREE SUCCEDING ODD NO");
        System.out.println("ENTER A ODD NEGATIVE NO OR POSITIVE EVEN NO");
        a=in.nextInt();
        if (a<0 && a%2!=0)
        {
           System.out.println("THE CONSIQUTIVE POSITIVE EVEN NO"+(a+2)+","+(a+4)+","+(a+6));
        }
           else if(a>=0 && a%2==0)
           {
               System.out.println("THE CONSICUTIVE NEGATIVE ODD NO"+(a-2)+","+(a-4)+","+(a-6));
           }
           else
           {
               System.out.println("IT IS NOT FULFILING THE CONDITION");
    }
}
}
