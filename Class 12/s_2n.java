import java.util.Scanner;
class s_2n
{
    public static void main(String [] args)
    {
        int a,b,c;
        Scanner in=new Scanner (System.in);
        System.out.println("INPUT THREE UNIQUE NO TO KNOW THE 2ND SMALEST OF IT");
        System.out.println("ENTER THE 1ST NO");
        a=in.nextInt();
        System.out.println("ENTER THE 2ND NO");
        b=in.nextInt();
        System.out.println("ENTER THE 3rd NO");
        c=in.nextInt();
        if (a<b && b<c || c<b && b<a)
        {
            System.out.println("IT IS THE SECOND SMALEST NO "+b);
        }
        else if (b<a && a<c || c<a && a<b)
        {
            System.out.println("IT IS THE SECOND SMALEST NO "+a);
        }
        else if (a<c && c<b || a<c && c<b)
        {
            System.out.println("IT IS THE SECOND SMALEST NO "+c);
        }
        else 
        {
            System.out.println("THE CONDITION DOSE NOT FULL FILE");
        }
    }
}