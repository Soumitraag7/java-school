import java.util.*;
class ifmorf
{
    public static void main (String [] args)
    {
        double i;
        int a;
        String m;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER YOUR GENDER");
        m=in.next();
        //g=in.nextLine();
        System.out.println("ENTER \n YOUR AGE");
        a=in.nextInt();
        /*System.out.println("ENTER YOUR GENDER");
        g=in.next();*/
        System.out.println("ENTER YOUR INCOME");
        i=in.nextDouble();
        if (m.equals("m") && a<=65)
        {
            if (i<=160000)
            {
                System.out.println("NIL");
            }
            else if(i>=160000 && i<500000)
            {
                i=(i*10)/100;
                System.out.println("INCOME TAX /n PAYBEL= "+i);
            }
            else if(i>=500000 && i<800000)
            {
                i=((i*20)/100)+34000;
                System.out.println("INCOME TAX PAYBEL= "+i);
            }
            else
            {
                i=((i*30)/100)+94000;
                System.out.println("INCOME TAX PAYBEL= "+i);
            }
        }
        else
        {
            System.out.println("WRONG CATEGORI");
        }
    }
}