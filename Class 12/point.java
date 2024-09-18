package sawmitra;
// prime And palim no generate and check
import java.util.Scanner;
class point
{
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
    public boolean palim(int c)
    {
        int i,j,rev=0;
        int c1=c;
        while (c>0)
        {
            j=c%10;
            rev=rev*10+j;
            c=c/10;
        }
        if(rev==c1)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    public void genpalprime(int a1)
    {
        int pa,pr;
        int nm=1;
        int count=0;
        if(a1==2)
        {
            System.out.println("11");
            count++;
        }
        else if(a1==3)
        {
            int n1=101;
            for(int i=2;i<=9;i++)
            {
                if(prime(i)==true)
                {
                   nm=n1+i*10;
                
                   if(prime(nm)==true && palim(nm)==true)
                   {
                      System.out.println("The no is= "+nm);
                      count++;
                    }
                }
            }
            
        }
        else if(a1==4)
        {
            int n1=1001;
            for(int i=11;i<=99;i++)
            {
                if (prime(i)==true)
                {
                    nm=n1+i*10;
                    if(prime(nm)==true && palim(nm)==true)
                    {
                        System.out.println("The no is= "+nm);
                        count++;
                    }
                }
            }
            
        }
        else if(a1==5)
        {
            int n1=10001;
            for(int i=101;i<=999;i++)
            {
                if(prime(i)==true)
                {
                   nm=n1+i*10;
                   if(prime(nm)==true && palim(nm)==true)
                   {
                      System.out.println("The no is= "+nm);
                      count++;
                    }
                }
            }
            
        }
        else 
        {
            if(a1<2 || a1>5)
            System.out.println("plz enter the no with in the range");
        }
        if (a1>=2 && a1<=5 && count==0)
        System.out.println("no palprime no inthis range");
    }
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int a;
        System.out.println("Enter a no");
        a=in.nextInt();
        point ob=new point();
        ob.genpalprime(a);
    }
}