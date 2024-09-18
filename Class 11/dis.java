import java.util.*;
class dis
{
    public static void main (String [] args)
    {
        int a;
        double dis,fa;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE AMOUNT PURCHASED");
        a=in.nextInt();
        if (a<=2000 && a>0)
        {
            dis=(a*5.0)/100.0;
            System.out.println("YOU WILL GEAT A WALL CLOCK AS A GIFT");
        }
        else if (a>2000 && a<5000)
        {
            dis=(a*10.0)/100.0;
            System.out.println("YOU WILL GEAT A SCHOOL BAG AS A GIFT");
        }
        else if (a>5000 && a<10000)
        {
            dis=(a*15.0)/100.0;
            System.out.println("YOU WILL GEAT A ELECTRIC IRON AS A GIFT");
        }
        else
        {
            dis=(a*20.0)/100.0;
            System.out.println("YOU WILL GEAT A WRIST WATCH AS A GIFT");
        }
        System.out.println("YOU AMOUNT OF PURCHASE= "+a);
        System.out.println("YOU GOT THE DISCOUNT OF Rs"+dis);
        System.out.println("YOU HAVE TO PAY: "+(a-dis));
    }
}