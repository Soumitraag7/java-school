import java.util.*;
class ld_if_else
{
    public static void main(String [] args)
    {
        int a;
        String x,n,add;
        double dis,nta;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER YOUR NAME");
        n=in.nextLine();
        System.out.println("ENTER YOUR ADDRESS");
        add=in.nextLine();
        System.out.println("ENTER YOUR AMOUNT OF PURCHASE");
        a=in.nextInt();
        System.out.println("ENTER l FOR LAPTOP OR d FOR DESKTOP");
        x=in.next()/*;.charAt(0)*/;
        if (x==/*.equal*/("l"))
        {
            if (a>0 && a<=25000)
            {
                System.out.println("YOU PURCHASE IS BELOW 25000 SO YOU WILL NOT GET ANY DISCOUNT SO YOR NET AMOUNT= "+a);
            }
            else if (a>25000 && a<=57000)
            {
                dis=(5.0/100)*a;
                nta=a-dis;
                System.out.println("YOU A DISCOUNT OF Rs"+dis+" SO YOR NET AMOUNT= "+nta);
            }
            else if (a>57000 && a<=100000)
            {
                dis=(7.5/100)*a;
                nta=a-dis;
                System.out.println("YOU A DISCOUNT OF Rs"+dis+" SO YOR NET AMOUNT= "+nta);
            }
            else
            {
                dis=(10.0/100)*a;
                nta=a-dis;
                System.out.println("YOU A DISCOUNT OF Rs"+dis+" SO YOR NET AMOUNT= "+nta);
            }
        }
        else
        {
            if(a>0 && a<=25000)
            {
                dis=(5.0/100)*a;
                nta=a-dis;
                System.out.println("YOU A DISCOUNT OF Rs"+dis+" SO YOR NET AMOUNT= "+nta);
            }
            else if (a>25000 && a<=57000)
            {
                dis=(7.5/100)*a;
                nta=a-dis;
                System.out.println("YOU A DISCOUNT OF Rs"+dis+" SO YOR NET AMOUNT= "+nta);
            }
            else if (a>57000 && a<=100000)
            {
                dis=(10.0/100)*a;
                nta=a-dis;
                System.out.println("YOU A DISCOUNT OF Rs"+dis+" SO YOR NET AMOUNT= "+nta);
            }
            else
            {
                dis=(15.0/100)*a;
                nta=a-dis;
                System.out.println("YOU A DISCOUNT OF Rs"+dis+" SO YOR NET AMOUNT= "+nta);
            }
        }
    }
}