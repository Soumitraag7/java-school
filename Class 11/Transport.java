//Program for transport charges
import java .util.*;
class Transport
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("This program is designed to display the charge of transport");
        int a,b,sum;
        System.out.print ("Enter (1) for Kolkata,(2) for Mumbai,(3) for Channai,(4) for Delhi :");
        a=in.nextInt();
        if(a==1)
        {
            System.out.print ("Enter the weight for Kolkata :");
            b=in.nextInt();
        if(b<=100)
        {
            sum=b*45;
            System.out.print(sum);
        }
        else
        {
            sum=b*75;
            System.out.print(sum);
        }
    }
    else
     if(a==2)
        {
            System.out.print ("Enter the weight for Mumbai :");
        b=in.nextInt();
        if(b<=100)
        {
            sum=b*65;
            System.out.print(sum);
        }
        else
        {
            sum=b*95;
            System.out.print(sum);
        }
    }
    else
     if(a==3)
        {
            System.out.print ("Enter the weight for Channai :");
        b=in.nextInt();
        if(b<=100)
        {
            sum=b*75;
            System.out.print(sum);
        }
        else
        {
            sum=b*115;
            System.out.print(sum);
        }
    }
    else
     if(a==4)
        {
            System.out.print ("Enter the weight for Delhi :");
        b=in.nextInt();
        if(b<=100)
        {
            sum=b*90;
            System.out.print(sum);
        }
        else
        {
            sum=b*125;
            System.out.print(sum);
        }
    }
}
}















    
    
    
    

            
        