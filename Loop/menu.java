package loop;
import java.util.Scanner;
class menu
{
    public static void main(String[]args)
    {
        int n,a,b,c=0,hcf=0;
        double sum=0;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter 1 IF YOU WANT TO FIND THE BUZ NO. OR ENTER 2 IF U WANT TO FIND THE HCF OF THE NO");
        n=in.nextInt();
        System.out.println("ENTER A=");
        a=in.nextInt();
        switch(n)
        {
            //System.out.println("ENTER A=");
            //a=in.nextInt();
            case 1:
            for(int i=1;i<=a;i++)
             {
                c=a%10;
             }
            if(a%7==0 || c==7)
            {
                System.out.println("IT'S A BUZ NO");
            }
            else
            {
                System.out.println("IT'S NOT A BUZ NO");
            }
            //System.out.println(c);
            break;
            case 2:
            for (int i=1;i<=a;i++)
            {
                if (a%i==0)
                {
                    hcf=i;
                }
            }
            System.out.println("HCF OF "+a+" = "+hcf);
            break;
            default:
            System.out.println("WRONG INPUT");
        }
    }
}