import java.util.Scanner;
class shoroom_2
{
    public static void main(String args[])
    {
        int a,b,c,d,e,f,g,h,i;
        Scanner in=new Scanner (System.in);
        System.out.println("WE ARE ALLOWING GIFT ACCORDING TO THE AMMUNT OF YUOUR PURCHASE");
        System.out.println("ENTRE THE AMOUNT YOUR PURCHASED(in Rs)= ");
        a=in.nextInt();
        if (a<=200)
        {
            b=(a*5)/100;
            c=a-b;
            System.out.println("YOU HAVE PURCHASED LESS THEN Rs2000 SO YOU WILL GET 5% DISCOUNT");
            System.out.println("YOUR AMMOUNT AFTER THE DISCOUNT OF 5%= "+c);
            System.out.println("YOU GET A 'WALL CLOCK' AS A GIFT");
        }
        else if (a>=2001 && a<=8000)
        {
            d=(a*10)/100;
            e=a-d;
            System.out.println("YOU HAVE PURCHASED BETWEEN Rs2001 TO Rs8000 SO YOU WILL GET 10% DISCOUNT");
            System.out.println("YOUR AMMOUNT AFTER THE DISCOUNT OF 10%= "+e);
            System.out.println("YOU GET A 'SCHOOL BAG' AS A GIFT");
        }
        else if (a>=8001 && a<=10000)
        {
            f=(a*15)/100;
            g=a-f;
            System.out.println("YOU HAVE PURCHASED BETWEEN Rs8001 TO Rs10000 SO YOU WILL GET 15% DISCOUNT");
            System.out.println("YOUR AMMOUNT AFTER THE DISCOUNT OF 15%= "+g);
            System.out.println("YOU GET A 'IRON' AS A GIFT");
        }
        else
        {
            h=(a*20)/100;
            i=a-h;
            System.out.println("YOU HAVE PURCHASED MORETHEN Rs10001 SO YOU WILL GET 20% DISCOUNT");
            System.out.println("YOUR AMMOUNT AFTER THE DISCOUNT OF 20%= "+i);
            System.out.println("YOU GET A 'WRIST WATCH' AS A GIFT");
        }
    }
}