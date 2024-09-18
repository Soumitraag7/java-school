package if_else;
import java.util.Scanner;
class int_59
{
    public static void main (String args[])
    {
        int a,b,c,sum,product,ts;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER YOUR 2-DIGIT NUMBER= ");
        a=in.nextInt();
        b=a/10;
        c=a%10;
        sum=b+c;
        product=b*c;
        ts=sum+product;
        System.out.println("SUM OF \t\t"+b+"+"+c+"="+sum);
        System.out.println("PRODUCT OF \t"+b+"*"+c+"="+product);
        System.out.println("TOTAL SUM OF \t"+sum+"+"+product+"="+ts);
        if (ts==a)
        {
            System.out.println("IT IS A SPECIAL 2-DIGIT NUMBER");
        }
        else
        {
            System.out.println("IT'S NOT A SPECIAL 2-DIGIT NO");
        }
    }
}