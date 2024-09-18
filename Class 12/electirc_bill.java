import java.util.*;
class electirc_bill
{
    public static void main(String [] args)
    {
        String c;
        String m;
        double cn,u;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER YOUR NAME");
        c=in.nextLine();
        System.out.println("ENTER YOUR CONSUMER NO");
        cn=in.nextDouble();
        System.out.println("ENTER THE MONTH IN WORDS");
        m=in.next();
        System.out.println("ENTER THE UNIT CONSUMED");
        u=in.nextDouble();
        System.out.println("CONSUMER NAME:    "+c);
        System.out.println("FOR THE MONTH OF- "+m);
        System.out.println("UNIT CONSUMED:    "+u);
        if (u<=100)
        {
            u=u*1.80;
            System.out.println("YOUR BILL FOR THE MONTH OF- "+m+" IS "+u);
        }
        else if (u>100 && u<=300)
        {
            u=u*2.30;
            System.out.println("YOUR BILL FOR THE MONTH OF- "+m+" IS "+u);
        }
        else if (u>300 && u<=500)
        {
            u=u*2.80;
            System.out.println("YOUR BILL FOR THE MONTH OF- "+m+" IS "+u);
        }
        else
        {
            u=u*3.50;
            System.out.println("YOUR BILL FOR THE MONTH OF- "+m+" IS "+u);
    }
  }
}