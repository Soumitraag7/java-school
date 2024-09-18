import java.util.*;
class ar_big_small
{
    public static void main(String[]args)
    {
        int a[]=new int [10];
        int bg,sm,x=1;
        int min,max;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter 10 no=");
        for (int i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        min=a[0];
        max=a[0];
        for(int j=1;j<=9;j++)
        {
            if (a[j]<min)
            {
                min=a[j];
            }
            else if(a[j]>max)
            {
                 max=a[j];
            }
        }
        System.out.println(min+"\t is the smalest no of all");
        System.out.println(max+"\t is the bigest no of all");
    }
}