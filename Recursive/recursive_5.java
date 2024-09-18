// fibonacic series
package Recursive;
import java.util.Scanner;
class recursive_5
{
    int fib(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        else
        {
            return (fib(n-1)+fib(n-2));
        }
    }
    public static void main (String [] args)
    {
        int a,b;
        Scanner in=new Scanner (System.in);
        System.out.println("Enetr a number");
        a=in.nextInt();
        recursive_5 ob=new recursive_5();
        System.out.println("The no are ");
        for (int i=1;i<=a;i++)
        {
            int c=ob.fib(i);
            System.out.println(c);
        }
    }
}