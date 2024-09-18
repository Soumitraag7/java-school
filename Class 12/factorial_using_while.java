import java.util.Scanner;
class factorial_using_while
{
    public static void main (String []args)
    {
        int a;
        int sum=1,i;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        while(a>=1)
        {
            sum=sum*a;            
            a--;
        }
        System.out.print(sum);
    }
}