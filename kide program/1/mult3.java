import java.util.Scanner;
class mult3
{
    public static void main(String args[])
    {
        int a,b,c,d,e,f,g,mul;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        b=a/100;
        c=a%10;
        d=a/10;
        e=d%10;
        mul=(b*c*e);
        System.out.println("Multiplication of the no.="+mul);
    }
}
        
    