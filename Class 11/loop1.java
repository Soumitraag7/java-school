import java.util.Scanner;
class loop1
{
    public static void pat(int n)
    {
        int i,j,k,l;
        for(i=n;i>=1;i--)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        for(k=n-1;k<=n;k++)
        {
            for(l=k;l<=n;l++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        int a;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the no of lines you want to print");
        a=in.nextInt();
        loop1 ob=new loop1();
        ob.pat(a);
    }
}