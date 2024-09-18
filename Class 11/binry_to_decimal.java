import java.util.Scanner;
class binry_to_decimal
{
    public static void main(String [] args)
    {
        int a,b,i=0;
        double arm=0;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        while(a>0)
        {
            b=a%10;
            a=a/10;
            arm=arm+Math.pow(2,i)*b;
            i++;
        }
        System.out.print(arm);
    }
}