import java.util.Scanner;
class whik
{
    public static void main(String[]args)
    {
        int a,i=2;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A=");
        a=in.nextInt();
        System.out.println("SHOWING THE EVEN NO TILL "+a);
        do
        {
            
            i=i+2;
        }while(i<=a);
        System.out.println(/*"\t"+*/i);
    }
}