package sawmitra;
import java.util.Scanner;
class add2
{
    public static int sum(int m,int n)
    {
        int s=0;
        s=m+n;
        return(s);
    }
    public static void main(String [] args)
    {
        Scanner in =new Scanner (System.in);
        int a,b;
        System.out.println("Enter the 1st no");
        a=in.nextInt();
        System.out.println("Enter the 2nd no");
        b=in.nextInt();
        int c=sum(a,b);
        System.out.println("Sum of the no are= "+c);
    }
}