package loop;
import java.util.*;
class nes13
{
    public static void main(String[]args)
    {
        int i,j,k,l=1;
        int n;
        Scanner a=new Scanner (System.in);
        System.out.println("Enter the number of lines you want=");
        n=a.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=l;k++)
            {
                System.out.print("*");
            }
            l+=2;
            System.out.println("");
        }
    }
}