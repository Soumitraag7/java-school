import java.util.Scanner;
class fibonacci_siris
{
    public static void main(String[]args)
    {
        int n,a=1,b=0,c=0;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER n=");
        n=in.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print(c+",");
            c=a+b;
            a=b;
            b=c;//System.out.println(c+",");
        }
        //System.out.println(s);
    }
}