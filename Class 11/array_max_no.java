import java.util.*;
class array_max_no
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int a[]=new int [10];
        int sum=0,max;
        for (int i=0;i<10;i++)
        {
            System.out.println ("Enter the value of array :");
            a[i]=in.nextInt();
        }
        max=a[1];
        for (int i=0;i<10;i++)
        if (a[i]>max)
        max=a[i];
        System.out.println ("max value is :"+max);
    }
}
        
        