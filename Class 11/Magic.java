import java .util.Scanner;
class Magic
{
    public static void main (String [] args)
    {
        int as;
        char st;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        st=in.next().charAt(0);
        int ascii=(int)st;
        System.out.println("The ASCII code is: "+ascii);
    }
}