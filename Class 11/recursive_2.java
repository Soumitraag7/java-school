import java.util.Scanner;
class recursive_2
{
    int run(int p, int q)
    {
        if(q==0)
        {
            return p;
        }
        else
        {
            return run(q,p%q);
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
        recursive_2 ob=new recursive_2();
        int c=ob.run(a,b);
        System.out.println("G.C.D of "+a+" and "+b+" = "+c);
    }
}