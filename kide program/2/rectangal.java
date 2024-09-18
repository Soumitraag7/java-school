import java.util.Scanner;
class rectangal
{
    public static void main (Scanner args[])
    {
        float l,b,area;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the value of L= ");
        l=in.nextFloat();
        System.out.println("Enter the value of B= ");
        b=in.nextFloat();
        area=l*b;
        System.out.println("Your answer= "+area);
    }
}