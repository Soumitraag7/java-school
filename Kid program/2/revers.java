import java.util.Scanner;
class revers
{
    public static void main(String args[])
    {
      int a,b,c,d,e,add;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of A= ");
        a=in.nextInt();
        b=a%10;
        c=a/10;
        d=c%10;
        e=c/10;
        add=(b*100)+(d*10)+e;
        System.out.println("Your revers of A= "+add);
    }
}