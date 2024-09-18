import java .util.*;
class array_bubble_sort
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int a[]=new int [5];
        int t=0;
        System.out.println ("Enter the numbers :");
        for(int i=0;i<=4;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<(4-i);j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("Sorted Array");
        for(int i=0;i<=4;i++)
        {
            System.out.println(+a[i]);
        }
    }
}
            
    

         