import java.util.Scanner;
class sum
{
    public static void main(String [] args)
    {
        int a,b;
        char x;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A=");
        a=in.nextInt();
        System.out.println("ENTER B=");
        b=in.nextInt();
        System.out.println("ENTER + FOR FINDING THE SUM, - FOR THE DIFFERENCE AND * FOR THE PRODUCT");
        x=in.next().charAt(0);
        switch(x)
        {
            case '+':
            a=a+b;
            System.out.println("THE SUM= "+a);
            break;
            case '-':
            a=a-b;
            System.out.println("THE DIFFERENCE= "+a);
            break;
            case '*':
            a=a*b;
            System.out.println("THE PRODUCT= "+a);
            break;
            default:
            System.out.print("WRONG INPUT");
        }
    }
}