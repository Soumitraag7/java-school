import java.util.Scanner;
class marks_of_avg
{
    public static void main(String args[])
    {
        float a,b,c,d,e,add,avg;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value for A= ");
        a= in.nextFloat();
        System.out.println("Enter the value for B= ");
        b=in.nextFloat();
        System.out.println("Enter the value for C= ");
        c=in.nextFloat();
        System.out.println("Enter the value for D= ");
        d=in.nextFloat();
        System.out.println("Enter the value for E= ");
        e=in.nextFloat();
        add=a+b+c+d+e;
        System.out.println("Your ANS= "+add);
        avg=((a+b+c+b+e)/5)*100;
        System.out.println("Your AVG= "+avg);
    }
}
        