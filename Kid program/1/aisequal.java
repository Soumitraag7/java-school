import java.util.Scanner;
class aisequal
{
    public static void main(String args[])
    {
        int a,b;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER YOUR NUMBER");
        a=in.nextInt();
        System.out.println("ENTER YOUR NUMBER");
        b=in.nextInt();
        if (a>b)
        {
            System.out.println("A>B");
        }
        else if (a==b)
        {
            System.out.println("A=B");
        }
        else
        {
            System.out.println("A=B");
        }
    }
}