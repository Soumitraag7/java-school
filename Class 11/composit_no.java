import java.util.Scanner;
class composit_no
{
    public static void main(String[]args)
    {
        int a,n,i,z=0;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER n=");
        a=in.nextInt();
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
               z++;
            }
        }
        if (z<=2)
        {
             System.out.println("IT IS NOT A COMPOSIT NO");
        }
        else
        {
            System.out.println("IT IS A COMOSIT NO");
        }
    }
}