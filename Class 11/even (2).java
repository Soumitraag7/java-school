import java.util.Scanner;
class even
{
    public static void main(String args[])
{
    int a;
    Scanner in=new Scanner(System.in);
    System.out.println("enter the number");
    a=in.nextInt();
    if(a%2==0)
    {
        System.out.println(a+"number is even");
    }
    else
    {
        System.out.println(a+"number is not even");
    }
}
}
        