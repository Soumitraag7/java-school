import java.util.Scanner;
class cur
{
    public static void main (String args[])
    {
        float r,area;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter R= ");
        r=in.nextFloat();
        area=2*22/7*r;
        System.out.println("Your answer= "+area);
    }
}