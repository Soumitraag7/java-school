import java.util.Scanner;
class test
{
    public static void main(String [] args)
    {
        int a1=111,sum=0,b;
        while(a1>0)
        {
            b=a1%10;
            a1=a1/10;
            
            sum=sum+b;
            
            System.out.println("b "+b);
            System.out.println("s "+sum);
            System.out.println("a "+a1);
        }
        System.out.println("\n"+sum);
    }
}