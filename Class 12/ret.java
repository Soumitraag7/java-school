import java.util.Scanner;
class ret
{
    public static void main()
    {
        int n1,n2,sum;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a no");
        n1=in.nextInt();
        System.out.println("Enter a no");
        n2=in.nextInt();
        ret obj=new ret();
        sum=obj.add(n1,n2);
        System.out.println("Sum="+sum);
    }
    int add(int a, int b)
    {
        int sum;
        sum=a+b;
        return(sum);
    }
}