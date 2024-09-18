package loop;
import java.util.*;
class nes3
{
    public static void main(String []args)
    {
        int n,i,j;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number of lines you want=");
        n=a.nextInt();
        for (i=n;i>=1;i--)
        {
            for (j=n;j>=1;j--)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}