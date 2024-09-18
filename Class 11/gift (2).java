package if_else;
import java.util.Scanner;
class gift
{
    public static void main (String args[])
    {
        int a,b;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER YOUR PRODUCT CORD");
        a=in.nextInt();
        System.out.println("ENTER YOUR AMOUNT OF PURCHASE");
        b=in.nextInt();
        if (b>=100 && b<=500)
        {
            System.out.println("THANK YOU FOR YOUR PURCHASE :)");
            System.out.println("YOU WILL GET A KEY RING AS A GIFT");
        }
        else if (b>=500 && b<=1000)
        {
            System.out.println("THANK YOU FOR YOUR PURCHASE :)");
            System.out.println("YOU WILL GET A LEATHER PURSE AS A GIFT");
        }
        else
        {
            System.out.println("THANK YOU FOR YOUR PURCHASE :)");
            System.out.println("YOU WILL GET A POCKET CALCULATER AS A GIFT");
        }
    }
}