import java.util.Scanner;
class ar6
{
    public static void main(String[]args)
    {
        int a[]; a=new int [10];
        int sum=0,j;
        Scanner z=new Scanner (System.in);
        System.out.println("A=");
        for(int i=0;i<10;i++)
        {
            a[i]=z.nextInt();
        }
        for(j=1;j<10;j+=2)
        {
            sum=sum+a[j];
        }
        System.out.println("Sum of all the even no= "+sum);
    }
}