import java.util.Scanner;
public class profit
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int sp,cp,p;
        System.out.print("Enter the cost price :");
        cp=in.nextInt();
        System.out.print("Enter the selling price :");
        sp=in.nextInt();
        p=sp-cp;
        System.out.print("The profit is :"+p);
    }
}
        