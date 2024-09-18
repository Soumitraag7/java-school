import java.util.Scanner;
class use_dw
{
    public static void main(String[]args)
    {
        int n,j,i=1;
        Scanner in=new Scanner(System.in);
        System.out.println("N=");
        n=in.nextInt();
        do
        {
            //System.out.println("");
            j=1;
            do
            {
                System.out.print("1");
                j++;
            }
            while(j<=i);
            System.out.println("");
            i++;
        }
            while(i<=n);
    }
}