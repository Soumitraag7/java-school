import java.util.Scanner;
class armgstrong_no
{
    public static void main(String[]args)
    {
        int a,b,c;
        int sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        c=a;
        while(a>0)
        {
            b=a%10;
            a=a/10;
            sum=sum+(b*b*b);
        }
        if(c==sum)
        {
           System.out.println("IT IS A ARMGSTRONG NO");
        }
        else
        {
           System.out.println("IT IS NOT A ARMGSTRONG NO");
        }
    }
}