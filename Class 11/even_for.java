import java.util.Scanner;
class even_for
{
    public static void main(String[]args)
    {
        int a;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A=");
        a=in.nextInt();
        System.out.println("SHOWING THE EVEN NO TILL "+a);
        for(int i=2;i<=a;i=i+2)
        {
            System.out.println(/*"\t"+*/i);
        }
    }
}