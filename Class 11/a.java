import java.util.*;
class a
{
    public static void main(String[]args)
    {
        int a,n,i;
        double s=0.0;double b=1.0;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER a=");
        a=in.nextInt();
        System.out.println("ENTER n=");
        n=in.nextInt();
        for (i=1;i<=n;i++)
        {
            s=s+(a/b);
            b=b+2.0;
        }
        System.out.println(s);
    }
}