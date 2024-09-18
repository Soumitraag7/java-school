import java.util.Scanner;
class big
{
    public static void main(String args[])
  {
    int a,b;
    Scanner in=new Scanner(System.in);
    System.out.println("enter the n");
    a=in.nextInt();
    System.out.println("enter the age");
    b=in.nextInt();
    if(a>b)
    {
        System.out.println("A is big");
    }
    else
    {
        System.out.println("B is big");
    }
  }
}