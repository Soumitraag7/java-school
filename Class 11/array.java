import java.util.*;
class array
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int a[]=new int [10];
        for (int i=0;i<10;i++)
        {
            System.out.println ("Enter the value of array :");
            a[i]=in.nextInt();
        }
        for (int i=0;i<10;i++)
        System.out.println ("Value intered in array :"+a[i]);
    }
}
        
        