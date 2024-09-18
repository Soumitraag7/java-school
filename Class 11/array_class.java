import java .util.*;
class array_class
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int a[]=new int[10];
        int b[]=new int[6];
        int sum=0;
        System.out.println ("Enter the roll no of students :");        
        for (int i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println ("Enter the marks of students :");
        for (int j=0;j<6;j++)
        {
            b[j]=in.nextInt();
        }
        for (int j=0;j<6;j++)
        {            
        sum=sum+b[j];        
        }
        if (sum>=80&&sum<=100)
        {
            sum=sum/10;
            System.out.print ("Grade A");
        }
        if (sum>=60&&sum<=79)
        {
            sum=sum/10;
            System.out.print ("Grade B");
        }
        if (sum>=40&&sum<=59)
        {
            sum=sum/10;
            System.out.print ("Grade c");
        }
        if (sum<=40)
        {
            sum=sum/10;
            System.out.print ("Grade D");
        }
    }
}


        
        
        
        
        