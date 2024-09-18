import java.util.Scanner;
public class numm
{
public static void main(String args[])
{
    int n2=858 ,n,n1,r,flag=0;;
    //n2=n;
    do
    {
        n1=n2%10;
        n=n2/10;
        do
        {
            r=n%10;
            n=n/10;
            if(n1==r)
            {
                flag=1;
                break;
            }
        }while(n>0);
        n2=n2/10;
    }while(n2>0);
    if(flag==0)
    System.out.print("yes");
    else
    System.out.print("no");
}
}