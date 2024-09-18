import java.util.Scanner;
class big
{
    public static void main (String [] args)
    {
        int a,b;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER TWO NO TO KNOW WHICH NO IS GREATER");
        System.out.println("ENTER YOUR 1ST NO");
        a=in.nextInt();
        System.out.println("ENTER YOUR 2ND NO");
        b=in.nextInt();
        if (a>b)
        {
            System.out.println("YOUR 1ST NO IS GREATRE THEN THE 2ND NO");
        }
        else if(b>a)
        {
            System.out.println("YOUR 2ND NO IS GREATRE THEN THE 1ST NO");
        }
        else if (a==b)
        {
            System.out.println("YOUR 1ST AND 2ND NO BOTH ARE EQUAL");
        }
    }
}