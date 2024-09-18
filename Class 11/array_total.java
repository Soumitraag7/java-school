import java.util.*;
class array_total
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int a[]=new int [5];
        int b[]=new int [5];
        int c[]=new int [10];
        int j=5;
        System.out.println ("Enter the value of array of a :");
        for (int i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter the value of array b:");
        for (int i=0;i<5;i++)
        {
            b[i]=in.nextInt();
        }
        for (int i=0;i<5;i++)
        {
            c[i]=a[i];
        }
        for (int i=0;i<5;i++)
        {
            c[j]=b[i];
            j++;
        }
        System.out.println("The value of a and b is :");       
        for (int i=0;i<10;i++)
        {
            System.out.print(c[i]+","+c[i]);
        }
    }
}



            
            
        