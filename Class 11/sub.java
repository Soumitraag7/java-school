import java.util.Scanner;
class sub
{
    public static void main(String args[])
    {
        int a,b,sub;
        Scanner in=new Scanner(System.in);
        System.out.println("A= ");
        a=in.nextInt();
        System.out.println("B= ");
        b=in.nextInt();
        sub=a-b;
        System.out.println("A-B= "+sub);
    }
}