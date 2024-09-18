import java.util.*;
class array_min_no
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int a[]=new int [10];
        int sum=0,min;
        for (int i=0;i<10;i++)
        {
            System.out.println ("Enter the value of array :");
            a[i]=in.nextInt();
        }
        min=a[1];
        for (int i=0;i<10;i++)
        if (a[i]<min)
        min=a[i];
        System.out.println ("min value is :"+min);
    }
}
        
        