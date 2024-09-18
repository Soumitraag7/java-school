import java.util.Scanner;
class right_ang_tng
{
    public static void main (String [] args)
    {
        int a,b,c,d;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THREE ANGLES TO KNOW THE TRIANGAL IS A RIGHT ANGLE TRIANGAL OR NOT");
        System.out.println("ENTER THE 1ST ANGLE");
        a=in.nextInt();
        System.out.println("ENTER THE 2ND ANGLE");
        b=in.nextInt();
        System.out.println("ENTER THE 3rd ANGLE");
        c=in.nextInt();
        d=a+b;
        if (a==90 || b==90 || c==90 && d+c==180)
        {
            System.out.println("IT IS A RIGHT ANGLE TRIANGAL");
        }
        else
        {
            System.out.println("IT IS NOT A TRIANGAL");
        }
    }
}