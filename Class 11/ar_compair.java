//leniar search
import java.util.*;
class ar_compair
{
    public static void main(String[]args)
    {
        int a[]=new int [10];
        int bg,sm,x=1;
        int b,y=0;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter 10 no=");
        for (int i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter the no bo be searched");
        b=in.nextInt();
        for(int j=0;j<=9;j++)
        {
            if (a[j]==b)
            {
                System.out.println("Positon is "+(j+1));
                y++;
            }
        }
        if(y==0)
        {
            System.out.println("The no is not found");
        }
    }
}