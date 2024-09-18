import java.util.*;
class ar_sel_short_as
{
    public static void main(String[]args)
    {
        int i,j,t,min;
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enetr the size of the array");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Eneter the no");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if (a[j]<a[min])
                {                    
                    min=j;
                }
            }
            t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        System.out.println("The number arranged is in assanding order");
        for (i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}