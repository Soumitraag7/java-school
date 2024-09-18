package bord_Q;


import java.util.Scanner;
class disarium
{
    int num,size;
    int s=0;
    disarium(int nn)
    {
        num=nn;
        size=0;
    }
    void countDigit()
    {
        int t=num;
        while(t>0)
        {
            size++;
            t/=10;
        }
    }
    int sumofDigit(int n ,int p)
    {
        if(p==0)
        return s;
        else
        {
            int d=n%10;
            s=s+(int)Math.pow(d,p);
            return sumofDigit(n/10,p-1);
        }
    }
    void check()
    {
        countDigit();
        if( sumofDigit(num,size) == num)
        {
            System.out.println("Disarium No.");
        }
        else
        System.out.println("Not a Disarium No.");
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a  No.");
        int a=in.nextInt();
        
        disarium ob=new disarium(a);
        ob.check();
    }
}       