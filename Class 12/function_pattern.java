import java.util.*;
class function_pattern
{
    public static void pattern(int n)
    {
        int i,j,g,k;
        for(i=n;i>=1;i--)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
        for(g=n-1;g<=n;g++)
        {
            for(k=g;k<=n;k++)
            {
                System.out.print(g);
            }
            System.out.println("");
        }
    }
    public static void main()
    {
        int a;
        Scanner in=new Scanner(System.in);
        function_pattern ob=new function_pattern();
        System.out.println("enter a number");
        a=in.nextInt();
        ob.pattern(a);
    }
}
        