import java.util.Scanner;
class use_w
{
    public static void main(String[]args)
    {
        int n,j,i=1;
        Scanner in=new Scanner(System.in);
        System.out.println("N=");
        n=in.nextInt();
        while(i<=n)
        {
            j=1;
            while(j<=i)
            {
                System.out.print("1");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}    