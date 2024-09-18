import java.util.Scanner;
class hcf
{
    public static void main(String[]args)
    {
        int a,b,i,x,hcf=0;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        System.out.println("B=");
        b=in.nextInt();
        x=a*b;
        for(i=1;i<=x;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        System.out.println("HCF IS= "+hcf);
    }
}