package sawmitra;

// twinprime number

import java.util.Scanner;
class twinp
{
    public int twin(int n)
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
    public static void main (String [] args)
    {
        int a1,a2;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the 1st no");
        a1=in.nextInt();
        System.out.println("Enter the 2nd no");
        a2=in.nextInt();
        twinp ob=new twinp();
        int k=ob.twin(a1);
        int l=ob.twin(a2);
        if ((k==1 && l==1) && (a1-a2==2 || a2-a1==2))
        System.out.println("The no is a twin prime number");
        else
        System.out.println("The no is not a twin prime number");
    }
}