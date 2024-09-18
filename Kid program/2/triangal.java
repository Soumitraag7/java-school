import java.util.Scanner;
class triangal
{
    public static void main(String args[])
    {
    float b,h,area;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the valu of B= ");
    b=in.nextFloat();
    System.out.println("Enter the valu of H= ");
    h=in.nextFloat();
    area=(b*h)/2;
    System.out.println("Your answer is= "+area);
}
}
    