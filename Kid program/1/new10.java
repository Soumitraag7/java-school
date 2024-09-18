import java.util.Scanner;
class new10
{
    public static void main(String args[])
    {
        int a,b,c,d,e,add,dev,mul,sub;
        Scanner in=new Scanner(System.in);
        System.out.println("A= ");
        a=in.nextInt();
        b=a/100;
        c=a/10;
        d=c%10;
        add=b+d;
        System.out.println("Sum of 1st $ 2nd no.= "+add);
    }
}
        