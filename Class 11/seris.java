import java.util.Scanner;
class seris
{
    public static void main(String[]args)
    {
        int a,i=1,b;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A=");
        a=in.nextInt();
        System.out.println("SHOWING NO TILL "+a);
        for(i=1;i<=a;i++)
        {
            //b=Math.pow(i,2);
            System.out.println(i*i);
        }
    }
}