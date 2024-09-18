import java.util.Scanner;
class s134
{
    public static void main(String[]args)
    {
        int n,s=0,b=1,a;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER n=");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            b=b*i;
            s=s+(b);System.out.println(b+", "+s);
        }
        System.out.println(s);
    }
}