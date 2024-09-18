/*constructor
 * 
 * output:
 * 
Enter a no
23
23 is a happy no

 * 
 */

import java.util.Scanner;
class happy
{
    int n;
    happy()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int sqofnum(int num)
    {
        int sum=0;
        int d=0;
        while(num>0)
        {
            d=num%10;
            sum+=(d*d);
            num=num/10;
        }
        return (sum);
    }
    void ishappy()
    {
        int nu;
        int sum=sqofnum(n);
        while(sum>9)
        {
            nu=sum;
            sum=sqofnum(nu);
        }
        if(sum==1)
        {
            System.out.println(n+" is a happy no");
        }
        else
        {
            System.out.println(n+" is not a happy no");
        }
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        happy ob1=new happy();
        
        System.out.println("Enter a no");
        int x=in.nextInt();
        ob1.getnum(x);
        ob1.ishappy();
    }
}