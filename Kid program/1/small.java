import java.util.Scanner;
class small
{
    public static void main(String args[])
    {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the age");
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