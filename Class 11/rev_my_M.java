import java.util.Scanner;
class rev_my_M
{
    public static void main(String[]args)
    {
        int rev=0,i=0,a,b;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A NO TO FIND THE REVERSE OF THE NO");
        System.out.println("A=");
        a=in.nextInt();
        for (;i>a;)
        {
            b=a%10;
            rev=rev*10+b;
            a=a/10;
        }
        System.out.println((rev*10)+a);
    }
}