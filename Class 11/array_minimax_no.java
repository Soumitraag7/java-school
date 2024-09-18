import java.util.*;
class array_minimax_no
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int a[]=new int [10];
        int sum=0,min,max;
        for (int i=0;i<10;i++)
        {
            System.out.println ("Enter the value of array :");
            a[i]=in.nextInt();
        }
        min=a[1];
        for (int i=0;i<10;i++)
        if (a[i]<min)
        min=a[i];
        System.out.println ("The minimum value is :"+min);
        max=a[1];
        for (int i=0;i<10;i++)
        if (a[i]>max)
        max=a[i];
        System.out.println ("The maximum value is :"+max);
    }
}
        
        