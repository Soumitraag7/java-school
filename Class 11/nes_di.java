import java.util.*;
class nes_di
{
    public static void main (String[]args)
    {
        int i,j,k,l;
        int n;
        Scanner a=new Scanner(System.in);
        System.out.println("N=");
        n=a.nextInt();
        for (i=n;i>=1;i--)
        {
            for (j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(l=1;l<n;l++)
            {
                System.out.print("a ");
            }
            System.out.println("");
        }
        /*for(k=1;k<=n;k++)
        {
            for(l=n;l>=1;l--)
            {
                System.out.print("a");
            }
            System.out.println("");
        }*/
    }
}