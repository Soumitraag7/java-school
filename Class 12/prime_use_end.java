import java.util.Scanner;
class prime_use_end
{
    public static void main (String args[])
    {
        int a,b,c=0;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a no to check for prime no.");
        a=in.nextInt();
        for(int i=0;i<a;i++)
        {
            b=a/i;
            c=c+b;
        }
        System.out.println(c);
    }
}