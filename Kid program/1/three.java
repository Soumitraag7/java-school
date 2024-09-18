import java.util.Scanner;
class three
{
    public static void main (String args[])
    {
        int a,b,c;
        Scanner in=new Scanner (System.in);
        System.out.println("A= ");
        a=in.nextInt();
        System.out.println("B= ");
        b=in.nextInt();
        System.out.println("c=");
        c=in.nextInt();
        if (a>b && a>c)
        {
            System.out.println("A is big");
        }
        else if (b>a && b>c)
        {
            System.out.println("B is big");
        }
        else
        {
            System.out.println("C is big");
        }
    }
}