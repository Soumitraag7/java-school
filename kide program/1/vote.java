import java.util.Scanner;
class vote
{
    public static void main(System args[])
    {
        int a;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        if(a>18)
        {
            System.out.println("he/she can vote");
        }
        else
        {
            System.out.println("he/she cannot vote");
        }
    }
}
            