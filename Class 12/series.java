package sawmitra;

// sum fo a series
/*
 * Output:
 * 
Enter the value of n
2
Sum= 8

 */

import java.util.Scanner;
class series
{
    public int sum(int a)
    {
        int sum=0,j=2;
     for(int i=1;i<=a;i++)
     {
         sum=sum+(i*j);
         j++;
    }
    return(sum);
}
public static void main(String [] args)
{
    Scanner in =new Scanner (System.in);
    int n;
    System.out.println("Enter the value of n");
    n=in.nextInt();
    series ob=new series();
    int k=ob.sum(n);
    System.out.println("Sum= "+k);
}
}   