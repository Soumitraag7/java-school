import java.util.Scanner;
class a
{
    public static void main(String args[])
    {
        int a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        System.out.println("B=");
        b=in.nextInt();
        if(a>b)
        {
            System.out.println("a is grater");
        }
        else
        {
            System.out.println("b is grater");
        }
    }
}
        