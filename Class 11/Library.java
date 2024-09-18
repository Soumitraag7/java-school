//Program for displaying library charges
import java .util.*;
class Library
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        double a,b;
        System.out.println ("This program is designed to display the charges of library");
        System.out.print ("Enter the number of days after the book was taken :");
        a=in.nextDouble();
        if(a<=5)
        {
            b=a*0.40;
        System.out.println ("Charge on the book : "+b);
    }
        else
        if(a>=6&&a<=10)
        {
            b=a*0.65;
        System.out.print ("Charge on the book : "+b);
    }
        else
        if(a>10)
        {
            b=a*0.80;
        System.out.println ("Charge on the book : "+b);
    }
}
}
        