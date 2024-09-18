import java.util.Scanner;
class iso
{
    public static void main (String [] args)
    {
        int a,b,c;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THREE ANGLE TO KNOW IF THE TRIANGLE IS ISO TRIANGAL OR NOT");
        System.out.println("ENTER THE 1ST ANGLE");
        a=in.nextInt();
        System.out.println("ENTER THE 2ND ANGLE");
        b=in.nextInt();
        System.out.println("ENTER THE 3RD ANGLE");
        c=in.nextInt();
        if (a+b+c==180)
        {
            if (a==60 && b==60 && c==60)
            {
                System.out.println("IT IS NOT A ISO TRIANGL");
            }
            else
            {
            if (a==b || b==c || c==a)
            System.out.println("IT IS A ISO TRIANGAL");
            else
            System.out.println("IT IS NOT A ISO TRIANGAL");
        }
        }
        else
        {
            System.out.println("IT IS NOT A TRIANGAL");
        }
    }
}