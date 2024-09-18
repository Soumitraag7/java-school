import java.util.Scanner;
class binary
{
    public static void main(String args[])
    {
        int a,b,c,d,e,f,g,h,add,mul;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the number=");
        a=in.nextInt();
        b=a*a;
        c=b/10;
        d=b%10;
        e=c+d;
        System.out.println("Your ans is="+e);
    }
}
