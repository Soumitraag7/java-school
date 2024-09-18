import java.util.*;
class factorial_do_while
{
    public static void main (String args[])
    {
        int a,sum=1;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        do
        {
            sum=sum*a;
            a--;
        }
        while (a>=1);
        System.out.println(sum);
    }
}