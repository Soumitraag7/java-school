import java.util.Scanner;
class rev_using_while
{
    public static void main(String[]args)
    {
        int i,rev=0;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        i=in.nextInt();
        while(i!=0)
        {
            rev=rev*10;
            rev=rev+i%10;
            i=i/10;
        }
        System.out.println(rev);
    }
}