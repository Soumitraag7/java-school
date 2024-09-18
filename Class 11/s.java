import java.util.*;
class s
{
    public static void main(String[]args)
    {
        int n,i;
        double s=0.0;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER n=");
        n=in.nextInt();
        for (i=1;i<=n;i++)
        {
            s=s+(1.0/i);
        }
        System.out.println(s);
    }
}