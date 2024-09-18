import java.util.Scanner;
class helloworld
{
    public static void main (String [] args)
    {
        Scanner in=new Scanner(System.in);
        
        int n, sum=0;
        int ar[];
        System.out.println("Enter the range:");
        n = in.nextInt();

        ar = new int[n];
        System.out.println("Enter the elemrnts of the array:");
        for(int i=0; i<n; i++)
        {
            ar[i]=in.nextInt();

            sum+=ar[i];
        }
        System.out.println("The sum is= "+sum);

    }
}

