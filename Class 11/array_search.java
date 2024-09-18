//linear search
import java .util.*;
class array_search
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int a[]=new int [10];
        int b,c=0;
        System.out.println("Enter the number :");
        for (int i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter the number you want to search :");
        b=in.nextInt();
        for (int i=0;i<5;i++)
        if(b==a[i])
        {
            c=1;
        }
        if(c==1)
        {
            System.out.println("The number you want to searched is found");
        }
        else
        {
             System.out.println("The number you want to searched is not found");
        }
        
    }
}

            
        