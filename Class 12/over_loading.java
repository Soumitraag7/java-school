/* function over loading
 * 
 * output:
 * 
 * Enter the range of the series
3
Enter the nuemereter
2
The sum of the 1st series= 1.6666666666666665
The sum of the 2nd series= 9

 * 
 */

import java.util.Scanner;
class over_loading
{
    public void sumseries(int n, double x)
    {
        double sum=0.0;
        for(int i=1;i<=n;i++)
        {
            if (i%2==0)
            {   
                sum=sum-(x/i);
            }
            else
            {
                sum=sum+(x/i);
            }
        }
        System.out.println("The sum of the 1st series= "+sum);
    }
    public void sumseries(int z)
    {
        int sm=0,s1=1;
        for(int i=1;i<=z;i++)
        {
            s1=s1*i;
            sm=sm+s1;
        }
        System.out.println("The sum of the 2nd series= "+sm);
    }
    public static void main(String [] args)
    {
        int a;
        double b;
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the range of the series");
        a=in.nextInt();
        
        System.out.println("Enter the nuemereter");
        b=in.nextDouble();
        
        over_loading ob=new over_loading();
        ob.sumseries(a,b);
        ob.sumseries(a);
    }
}