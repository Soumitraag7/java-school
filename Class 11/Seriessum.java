import java.util.Scanner;
class Seriessum
{
    int n,x;
    double sum;
    Seriessum()
    {
        n=0;
        x=0;
        sum=0;
    }
    int factorial(int x)
    {
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact*=i;
        }
        return fact;
    }
    double term(int p, int q)
    {
        return ( (double)p/factorial(q) );
    }
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter value for n and x");
        n=in.nextInt();
        x=in.nextInt();
    }
    void display()
    {
        System.out.println("Sum= "+sum);
    }
    void calsum()
    {
        double s=1, t;
        int p,q;
        for(int i=1;i<=n;i++)
        {
            p=(int)Math.pow(x,2*i-1);
            q=i;
            t=term(p,q);
            s+=t;
        }
        sum=s;
    }
    public static void main(String [] args)
    {
        Seriessum ob=new Seriessum();
        ob.accept();
        ob.calsum();
        ob.display();
    }
}