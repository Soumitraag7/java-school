import java.util.Scanner;
class even_while
{
    public static void main(String[]args)
    {
        int a,i=2;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A=");
        a=in.nextInt();
        System.out.println("SHOWING THE EVEN NO TILL "+a);
        while(i<=a)
        {
            System.out.println(/*"\t"+*/i);
            i=i+2;
        }
    }
}