import java.util.*;
class factorial_using_for
{
    public static void main(String args[])
    {
        int a,i;
        int sum=1;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        for(i=1;i<=a;i++)
        {
            sum=sum*i;
        }
        System.out.println(sum);
    }
}