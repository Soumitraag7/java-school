import java.util.*;
class array_add
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
        for (int i=0;i<10;i++)
        sum=sum+a[i];
        System.out.println ("sum="+sum);
    }
}