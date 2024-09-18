import java.util.Scanner;
class perfact_no
{
    public static void main(String[]args)
    {
        int a,b=0,i,x;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                b=b+i;
            }
        }
        if (b==a)
        System.out.println("IT'S A PERFACT NO");
        else
        System.out.println("IT'S NOT A PERFACT NO");
    }
}