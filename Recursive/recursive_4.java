package Recursive;
import java.util.Scanner;
class recursive_4
{
    int fib(int m)
    {
        if(m<=1)
        {
            return m;
        }
        else
        {
            return (fib(m-1)+fib(m-2));
        }
    }
    public static void main (String [] args)
    {
        int a,b;
        Scanner in=new Scanner (System.in);
        System.out.println("Enetr a number");
        a=in.nextInt();
        
        recursive_4 ob=new recursive_4();
        int c=ob.fib(a);
        System.out.println("The number is "+c);
    }
}