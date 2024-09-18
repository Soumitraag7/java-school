import java.util.Scanner;
class transverse
{
    void entNo(int r,int c)
    {
        Scanner in=new Scanner(System.in);
        int a1[][] = new int[r][c];
        System.out.println("Enetr the matrix of "+r+"x"+c);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a1[i][j]=in.nextInt();
            }
        }
        System.out.println("Original matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a1[i][j]+"\t");
            }
            System.out.println();
        } 
        System.out.println("The teansverse is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a1[j][i]+"\t");
            }
            System.out.println();
        }
    }
    public static void main (String args[])
    {
        int x,y;
        Scanner in=new Scanner (System.in);
        System.out.println("Eneter the no of rows");
        x=in.nextInt();
        System.out.println("Eneter the no of columns");
        y=in.nextInt();
        transverse ob=new transverse();
        ob.entNo(x,y);
    }
}