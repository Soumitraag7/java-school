import java.util.*;
class function_sum
{
    public int sum(int n)
    {
        int i,s=0;
        for(i=1;i<=n;i++)
        {
            s=s+i*(i+1);
        }
        return(s);
    }
    public static void main()
    {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        a=in.nextInt();
        function_sum ob=new function_sum();
        int p=ob.sum(a);
        System.out.println(p);
    }
}
            
