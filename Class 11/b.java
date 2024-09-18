import java.util.Scanner;
class b
{
    public static void main(String args[])
  {
    int a,b;
    Scanner in=new Scanner(System.in);
    System.out.println("enter the number");
    a=in.nextInt();
    System.out.println("enter the number");
    b=in.nextInt();
    
    if(a>b)
    {
        System.out.println(a+" is big");
    }
    else
    {
        System.out.println(b+" is big");
    }
  }
}