import java.util.Scanner;
class ar4_sum
{
    public static void main(String[]args)
    {
        int a[]; a=new int [10];
        int sum=0;
        Scanner z=new Scanner (System.in);
        System.out.println("Enter 10 no you want to add");
        for(int i=0;i<10;i++)
        {
            a[i]=z.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Sum= "+sum);
    }
}        