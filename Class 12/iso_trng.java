import java.util.Scanner;
class iso_trng
{
    public static void main (String [] args)
    {
        int a,b,c;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THE ANGLES FOR KNOWING THE TRIANGAL IS A ISO TRIANGAL");
        System.out.println("ENTER THE 1ST ANGLE");
        a=in.nextInt();
        System.out.println("ENTER THE 2ND ANGLE");
        b=in.nextInt();
        System.out.println("ENTER THE 3RD ANGLE");
        c=in.nextInt();
        if (a+b+c==180 && a==b||b==c||a==c)
        {
            
            System.out.println("IT IS A ISO TRIANGAL");
        }
        else
        {
            System.out.println("IT IS NOT A TRIANGAL");
        }
    }
}