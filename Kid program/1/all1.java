import java.util.Scanner;
class all1
{
    public static void main (String args[])
    {
        float a,b,add,sub,mul,div;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value for A= ");
        a=in.nextFloat();
        System.out.println("Enter the value for B= ");
        b=in.nextFloat();
        add=a+b;
        System.out.println("Your ANS= "+add);
        sub=a-b;
        System.out.println("Your ANS= "+sub);
        mul=a*b;
        System.out.println("Your ANS= "+mul);
        div=a/b;
        System.out.println("Your ANS= "+div);
    }
}
        