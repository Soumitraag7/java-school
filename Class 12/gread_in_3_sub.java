
import java.util.*;
class gread_in_3_sub
{
    public static void main (String [] args)
    {
        double p,c,b;
        String na;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER YOUR NAME");
        na=in.nextLine();
        System.out.println("ENTER THE MARK OF PHY");
        p=in.nextDouble();
        System.out.println("ENTER THE MARK OF CHM");
        c=in.nextDouble();
        System.out.println("ENTER THE MARK OF BIO");
        b=in.nextDouble();
        double avg=(p+c+b)/3.0;
        System.out.println("NAME:      "+na);
        System.out.println("PHYSICS:   "+p);
        System.out.println("CHEMISTRY: "+c);
        System.out.println("BIOLOGY:   "+b);
        System.out.println("AVEARAGE:  "+avg);
        if(avg>=80 && avg<=100)
        System.out.println("DISTNCTION");
        else if(avg>=60 && avg<=79)
        System.out.println("FIRST DEVISION");
        else if(avg>=45 && avg<=59)
        System.out.println("SECOND DEVISION");
        else if (avg>=40 && avg<=44)
        System.out.println("PASS");
        else
        System.out.println("PROMOTION NOT GRANTED");
    }
}