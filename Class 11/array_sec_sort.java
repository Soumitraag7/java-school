//array selection sort
import java .util.*;
class array_sec_sort
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int a[]= {91,1,3,4,11,6,2};
        int min,t;
        for (int i=0;i<6;i++)
        {
            min=i;
            for (int j=(i+1);j<7;j++)
            {
                if (a[j]<a[min])
                min=j;
            }
            t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        System.out.println("Sorted Array");
        for(int i=0;i<7;i++)
        {
            System.out.println(a[i]);
        }
    }
}
        