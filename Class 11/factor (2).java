import java.util.Scanner;
class factor
{
    public static void main(String[]args)
    {
        int a,n,i,z=0;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER n=");
        a=in.nextInt();
        System.out.println("FACTOR OF: "+a);
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
               System.out.println(i);
            }
        }
    }
}
/*import java.util.Scanner;
class factor_net
{
    public static void main(String[]args)
    {
        int a,n,i,z=0;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER n=");
        a=in.nextInt();
        System.out.println("FACTOR OF: "+a);
        for(i=1;i<=a/2;i++)
        {
            if(a%i==0)
            {
               System.out.println(i+" ");
            }
        }
        System.out.println(a);
    }
}*/