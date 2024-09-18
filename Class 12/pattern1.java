import java.util.*;
class pattern1
{
    public static void main(String args[])
    {
        int i,j,k,l,n;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
        for(k=n-1;k>=1;k--)
        {
            for(l=k;l>=1;l--)
            {
                System.out.print(l);
            }
            System.out.println("");
        }
    }
}

        