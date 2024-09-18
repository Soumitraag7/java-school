import java .util.*;
class array_country
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        String a[]=new String[5];
        String b[]=new String[5];
        String c[]=new String [10];
        int j=0;
        System.out.println("Enter the name of 5 countries :");
        for (int i=0;i<5;i++)
        {            
            a[i]=in.nextLine();                        
        }
        System.out.println ("Enter the capitals of those countries :");
        for (int i=0;i<5;i++)
        {
            b[i]=in.nextLine();
        }
        for (int i=0;i<5;i++)
        {
            c[i]=a[i];
        }
        for (int i=0;i<5;i++)
        {
            c[i]=b[i];
            j++;
        }
        System.out.println("Countries with their capitals :");       
        for (int i=0;i<10;i++)
        {
            System.out.println (c[i]);
        }
    }
}
        
         
                
        
        