import java.util.Scanner;
class double_d
{
    public static void main(String[]args)
    {
        int i,j,r,c;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the size of the row");
        r=in.nextInt();
        System.out.println("Enter the size of the colum");
        c=in.nextInt();
        System.out.println("----------------------------");
        System.out.println("Enter the elements of the mateix");
        int a[][]=new int [r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("----------------------------");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}