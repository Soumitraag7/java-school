import java.util.Scanner;
class great_small
{
    public static void main (String [] args)
    {
        int a,i,min,max;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER a no");
        a=in.nextInt();
        min=a;
        max=a;
        for (i=1;i<10;i++)
        {
            System.out.println("ENTER a no");
            a=in.nextInt();
            if (a<min)
            {
               min=a;
            }
            else if(a>max)
            {
               max=a;
            }
        }
        System.out.println(max+" IT'S THE GREATEST OF ALL");
        System.out.println(min+" IT'S THE SMALEST OF ALL");
    }
}