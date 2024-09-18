package loop;
import java.util.Scanner;
class series1
{
    public static void main(String[]args)
    {
        int a,i,sum=0,n;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        System.out.println("ENETER THE NO IN THE SEARIS");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+(a+i);
        }
        System.out.println("Ans= "+sum);
    }
}