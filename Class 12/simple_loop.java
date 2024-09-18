import java.util.Scanner;
class simple_loop
{
    public static void main(String args[])
    {
        int a,b,c=0;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        while(a>=0)
        {
            b=a%10;
            c=c+b;
            a=a/10;
        }
    }
}