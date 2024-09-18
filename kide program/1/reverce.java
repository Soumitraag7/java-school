import java.util.Scanner;
class reverce
{
    public static void main(String arga[])
    {
      int a,b,c,d,e,add;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of A=");
        a=in.nextInt();
        b=a%10;
        c=a/10;
        d=c%10;
        e=c/10;
        add=(b*100)+(d*10)+e;
        System.out.print("Your answer of A="+add);
    }
}
        