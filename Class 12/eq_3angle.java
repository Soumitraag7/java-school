import java.util.*;
class eq_3angle
{
    public static void main (String [] args)
    {
        int a,b,c,d;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THERE ANGLE OF A TRIANGAL TO KNOW THE TRIANGAL IS EQUILATARAL TRIANGAL OR NOT");
        System.out.println("ENTER THE 1ST ANGLE");
        a=in.nextInt();
        System.out.println("ENTER THE 2ND ANGLE");
        b=in.nextInt();
        System.out.println("ENTER THE 3ND ANGLE");
        c=in.nextInt();
        d=a+b+c;
        if(d==180 && a<=180 && b<=180 && c<=180)
        {
            System.out.println("IT IS A EQILATERAL TRIANGAL");
        }
        else
        {
            System.out.println("IT IS NOT EQILATERAL TRIANGAL");
        }
    }
}