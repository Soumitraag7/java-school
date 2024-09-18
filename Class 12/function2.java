import java.util.*;
class function2
{
    public static int Add(int m,int n)
    {
        int s=0;
        s=m+n;
        return(s);
    }
    public static void main()
    {
        int a,b,p;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS");
        a=in.nextInt();
        b=in.nextInt();
        p=Add(a,b);
        System.out.println(p);
    }
}
