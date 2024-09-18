package sawmitra;
// brunconstant && twinprime && prime
import java.util.Scanner;
class primes
{
    public void twin(int n)
    {
        int i,c=0;
        for(i=1;i<=n-2;i++)//for lim till 17(n-2)
        {
            if (prime(i)==true && prime(i+2)==true)
            {
                System.out.println("1/"+i+" , 1/"+(i+2));
            }
        }
    }
    public boolean prime(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if (n%i==0)
            c+=1;
        }
        if (c==2)
        return(true);
        else
        return(false);
    }
    public double brunconstant(int x)
    {
        double sum=0.0;
         for(int i=1;i<=(x-2);i++)//for lim till 17(n-2)
         {
             if (prime(i)==true && prime(i+2)==true)
            {
                sum+=(1.0/(double)i)+(1.0/(double)(i+2.0));
            }
        }
        return(sum);
    }
    public static void main (String [] args)
    {
        int lim;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the limit");
        lim=in.nextInt();
        primes ob=new primes();
        ob.twin(lim);
        double k=ob.brunconstant(lim);
        System.out.println("The brunconstant is= "+k);
    }
}