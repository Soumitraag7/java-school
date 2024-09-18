import java.util.Scanner;
class prime extends auto
{
    public int check(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if (n%i==0)
            c+=1;
        }
        if (c==2)
        return(1);
        else
        return(0);
    }
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int a;
        System.out.println("Enter a no to check if the no is prime no or not");
        a=in.nextInt();
        prime ob=new prime();
        int k=ob.check(a);
        if (k==1)
        System.out.println(a+" is a prime no");
        else
        System.out.println(a+" it is not a prime no");
    }
}