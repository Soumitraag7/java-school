import java.util.Scanner;
class double_di_add
{
    public static void main(String[]args)
    {
        int i,j,r,c;
        int sum=0;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the size of the matrix");
        r=in.nextInt();
        System.out.println("----------------------------");
        System.out.println("Enter the elements of the mateix");
        int a[][]=new int [r][r];
        for(i=0;i<r;i++)
        {
            for(j=0;j<r;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("----------------------------");
        System.out.println("The matrix is");
        for(i=0;i<r;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for(i=0;i<r;i++)
        {
            sum=sum+a[i][i];
        }
        System.out.println("Sum of left diagnoal= "+sum);
        //System.out.println("----------------------------");
        j=r-1;
        int s=0;
        for(i=0;i<r;i++)
        {
            s=s+a[i][j];
            j--;
        }
        System.out.println("Sum of the right diagonal= "+s);
    }
}