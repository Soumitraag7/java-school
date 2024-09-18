package Recursive;
import java.util.Scanner;
class recursive_3
{
    int run(int m, int n)
    {
        if(n==1)
        {
            return m;
        }
        else
        {
            return m*run(m,n-1);
        }
    }
    public static void main (String [] args)
    {
        int a,b;
        Scanner in=new Scanner (System.in);
        System.out.println("Enetr a number");
        a=in.nextInt();
        System.out.println("Enetr a number");
        b=in.nextInt();
        recursive_3 ob=new recursive_3();
        int c=ob.run(a,b);
        System.out.println("The ans of "+a+"^"+b+" = "+c);
    }
}