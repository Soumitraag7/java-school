import java.util.Scanner;
class grade
{
    public static void main (String args[])
    {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER YOUR MARK");
        a=in.nextInt();
        if (a>=80)
        {
            System.out.println("YOUR GRADE IS A");
        }
        else if (a<=79 && a>=60)
        {
            System.out.println("YOUR GRADDE IS B");
        }
        else if (a<=59 && a>=40)
        {
            System.out.println("YOUR GREAD IS C");
        }
        else if (a<=39 && a>=35)
        {
            System.out.println("YOUR GREAD IS P");
        }
        else
        {
            System.out.println("YOUR GREAD IS F");
        }
    }
}