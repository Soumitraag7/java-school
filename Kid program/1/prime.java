import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int a,b,c,add;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of A= ");
        a=in.nextInt();
        b=a%10;
        c=a/100;
        add=b+c;
        System.out.println("Your answer of A+C= "+add);
    }
}