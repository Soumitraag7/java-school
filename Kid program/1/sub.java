import java.util.Scanner;
class sub
{
    public static void main(String args[])
    {
     int a,b,c;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the first number that you want to subtract");
     a=in.nextInt();
     System.out.println("Enter your second number");
     b=in.nextInt();
     c=a-b;
     System.out.println("Your answer is "+c);
    }
}