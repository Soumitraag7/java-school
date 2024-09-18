// constructor program
/*
 * Output:
 * 

Enter the numerator
12
Enetr the denominator
6
Original fraction:12/6
Simplified fraction:
2/1

 * 
 */ 

import java.util.Scanner;
class RationalClass
{
    int nr,dr;
    int numerator,denominator;
    int numerator1,denominator1;
    RationalClass(int numerator , int denominator)
    {
        if (denominator==0)
        {
            System.out.println("Denominator is zero. Quiting!!!");
            System.exit(0);
        }
        else
        {
            nr=numerator;
            dr=denominator;
            numerator1=numerator;
            denominator1=denominator;
        }
    }
    int gcd(int a, int b)
    {
        int gcds=0;
        int l;
        l=a*b;
        for(int i=1;i<=l;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcds=i;
            }
        }
        return(gcds);
    }
    void simplify()
    {
        int no=gcd(nr,dr);
        nr=nr/no;
        dr=dr/no;
    }
    void print()
    {
        System.out.println("Original fraction:"+numerator1+"/"+denominator1);
        System.out.println("Simplified fraction:");
        if(dr==1)
        {
            System.out.println(nr+"/1");
        }
        else
        {
            System.out.println(nr+"/"+dr);
        }
    }
    public static void main (String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numerator");
        int n=in.nextInt();
        System.out.println("Enetr the denominator");
        int d=in.nextInt();
        RationalClass ob=new RationalClass(n,d);
        ob.simplify();
        ob.print();
    }
}