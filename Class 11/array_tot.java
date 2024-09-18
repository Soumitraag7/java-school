import java.util.*;
class array_tot
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
         int j=5;
        int a[]=new int [5];
        int b[]=new int [5];
        int c[]=new int [10];
        for (int i=0;i<5;i++)
        {
            System.out.println ("Enter the value of array a :");
            a[i]=in.nextInt();
            System.out.println ("Enter the value of array b :");
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
    System.out.println ("resultant");
    for (int i=0;i<10;i++)
    {
        System.out.println (c[i]);
}
}
}
    
        