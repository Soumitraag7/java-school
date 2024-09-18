package Recursive;
import java.util.Scanner;
class recursive_1
{
    int run(int n)
    { 
        if(n==1)
        {
            return 1;
        }
        else
        {
            return (n*run(n-1));
        }
        
    }
    public static void main (String [] args)
    {
        int a;
        Scanner in=new Scanner (System.in);
        System.out.println("Enetr a number");
        a=in.nextInt();
        recursive_1 ob=new recursive_1();
        int c=ob.run(a);
        System.out.println("Ans= "+c);
    }
}