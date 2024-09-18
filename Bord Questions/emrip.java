package bord_Q;


import java.util.Scanner;
class emrip
{
    int n,rev,f;
    emrip(int nn)
    {
        n=nn;
        rev=0;
        f=2;
    }
    int isprime(int x)
    {
        if(f<=x/2)
        {
            if(x%f==0)
            {
                return 0;
            }
            f++;
            return isprime(x);
        }
        return 1;
    }
    void isEmrip()
    {
        int t=n,d,a,b;
        while(t>0)
        {
            d=t%10;
            rev=rev*10+d;
            t=t/10;
        }
        f=2;
        a=isprime(n);
        f=2;
        b=isprime(rev);
        if(a==1 && b==1)
        {
            System.out.println(n+" is an Emrip No.");
        }
        else
        {
            System.out.println(n+" is not an Emrip No.");
        }
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a number");
        int num=in.nextInt();
        
        emrip ob=new emrip(num);
        ob.isEmrip();
    }
}
        