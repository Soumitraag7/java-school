import java.util.*;
class array_even
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int a[]=new int [10];
        int sum=0,eve=0;
        for (int i=0;i<10;i++)
        {
            System.out.println ("Enter the value of array :");
            a[i]=in.nextInt();
        }
        //eve=a[1];
        for (int i=0;i<10;i++)
        if (a[i]%2==0)
        
        System.out.println ("These are the even number :"+a[i]);
             
    }
}
        
        