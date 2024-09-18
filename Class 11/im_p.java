import java.util.Scanner;
class im_p
{
    void gen(int a)
    {
        int x;
        int c=0;
        while(a>0)
        {
            x=a%10;
            a/=10;
            c++;
        }
        System.out.println("Total number of digit= "+c);
    }
    int sm(int a1)
    {
        int sum=0,b;
        while(a1>0)
        {
            b=a1%10;
            a1/=10;
            sum=sum+b;
        }
        return (sum);
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int m,n;
        System.out.println("Enter number between 100 and 10000");
        m=in.nextInt();
        System.out.println("Enter number below 100");
        n=in.nextInt();
        int i=m;
        im_p ob=new im_p();
        if (m>=100 && m<10000 && n<=100)
        {
            ob.gen(m);
            while(ob.sm(i)!=n)
            {
                i++;
            }
            System.out.println("The number = "+i);
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}