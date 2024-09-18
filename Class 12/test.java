import java.util.Scanner;
class test
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String a,b,sum;
        System.out.println("Enter a txt");
        a=in.next();
        System.out.println("Enter another txt");
        b=in.next();
        sum=a+b;
        System.out.println("\n"+sum);
    }
}