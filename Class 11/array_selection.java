import java.util.Scanner;
class array_selection
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int a[]={454,855,9685,85855,9555,9655,65};
        System.out.println("The number are:");
        for (int i=0;i<=6;i++)
        System.out.println(a[i]);
        int min,t;
        for(int i=0;i<7;i++)
        {
            min=i;
            for(int j=i+1;j<7;j++)
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
        System.out.println("The shorted array is");
        for(int k=0;k<7;k++)
        System.out.println(a[k]);
    }
}