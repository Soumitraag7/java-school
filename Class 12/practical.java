package sawmitra;


import java.util.Scanner;
class practical
{
    void length(int a)
    {
        int c=0;
        int x;
        while(a>0)
        {
            x=a%10;
            a/=10;
            c++;
        }
        System.out.println("Total number of digits= "+c);
    }
    int su(int a1)
    {
        int sum=0;
        int x;
        while(a1>0)
        {
            x=a1%10;
            a1/=10;
            sum+=x;
        }
        return(sum);
    }
    public static void main(String args[])
    {
        int m,n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number between 100 and 10000");
        m=in.nextInt();
        System.out.println("Enter a number below 100");
        n=in.nextInt();
        int i=m;
        practical ob=new practical();
        if (m>=100 && m<10000 && n<=100)
        {
            ob.length(m);
            while(ob.su(i)!=n)
            {
                i++;
            }
            System.out.println("The requires number is= "+i);
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}