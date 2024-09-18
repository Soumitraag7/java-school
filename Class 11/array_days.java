import java.util.*;
class array_days
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int days=0,yd=0,md=0,hours,minutes,seconds;
        System.out.println ("Enter the number of years :");
        int y=in.nextInt();
        for (int i=0;i<0;i++)
        {
            int a[]=new int [y];
            a[i]=in.nextInt();
        }
        System.out.println ("Enter the number of months :");
        int m=in.nextInt();
        for (int j=0;j<0;j++)
        {
            int b[]=new int [m];
            b[j]=in.nextInt();
        }
        yd=y*365;
        md=m*30;
        days=yd+md;
        System.out.println ("Number of days :"+days);
        hours=days*24;
        System.out.println ("Hours :"+hours);
        minutes=hours*60;
        System.out.println ("Minutes :"+minutes);
        seconds=minutes*60;
        System.out.println ("Seconds :"+seconds);        
    }
}