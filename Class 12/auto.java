package sawmitra;

// automorphic number

import java.util.Scanner;
class auto
{
    public int digit(int n)
    {
        int c=0;
        double k,num;
        num=Math.pow(n,2);
        for(;n!=0;)
        {
            n=n/10;
            c++;
        }
        k=num%(Math.pow(10,c));
        int l=(int)k;
        return(l);
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner (System.in);
        int a;
        System.out.println("Enter the no to find if the no is Automorphic no or not");
        a=in.nextInt();
        auto ob=new auto();
        int k=ob.digit(a);
        if (k==a)
        {
            System.out.println(a+" is a automorphic no");
        }
        else
        {
            System.out.println(a+" is not a automorphic no");
        }
    }
}