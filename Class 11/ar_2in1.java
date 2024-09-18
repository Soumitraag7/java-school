import java.util.*;
class ar_2in1
{
    public static void main(String[]args)
    {
        int n,n2,z;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the first array size");
        n=in.nextInt();
        System.out.println("Enter "+n+" no:");
        int a[]=new int [n];
        for (int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter the second array size");
        n2=in.nextInt();
        System.out.println("Enter "+n2+" no:");
        int b[]=new int [n2];
        for (int j=0;j<n2;j++)
        {
            b[j]=in.nextInt();
        }
        int c[]=new int [n+n2];
        for (z=0;z<n;z++)
        {
            c[z]=a[z];
        }
        for (int x=0;x<n2;x++)
        {
            c[z]=b[x];
            z++;
        }
        System.out.println("Combination of both the array is");
        for (int l=0;l<n+n2;l++)
        {
            System.out.println(c[l]);
        }
    }
}