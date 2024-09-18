import java.util.Scanner;
class RationalClass
{
    int nr,dr;
    int numerator,denomminator;
    int numerator1,denomminator1;
    RationalClass(int numerator ,int denomminator)
    {
        if (denomminator==0)
        {
            System.out.println("Denomminator is zero Quitng!!");
            System.exit(0);
        }
        nr=numerator;
        dr=denomminator;
        numerator1=numerator;
        denomminator1=denomminator;
    }
    int gcd(int num, int din)
    {
        int i=1;
        int l=num*din;
        int gcd1=0;
        for(i=1;i<=l;i++)
        {
            if(num%i==0 && din%i==0)
            {
                gcd1=i;
            }
            
        }
        return(gcd1);
    }
    void simplify()
    {
        int no=gcd(nr,dr);
        nr=nr/no;
        dr=dr/no;
    }
    void print()
    {
        System.out.println("Original fraction:"+numerator1+"/"+denomminator1);
        System.out.println("Simplified fraction");
        if(dr==1)
        {
            System.out.println(nr);
        }
        else
        {
            System.out.println(nr+"/"+dr);
        }
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner (System.in);
        int n,d;
        System.out.println("Enter the numerator");
        n=in.nextInt();
        System.out.println("Enter the denomminator");
        d=in.nextInt();
        RationalClass ob=new RationalClass(n,d);
        ob.simplify();
        ob.print();
    }
}