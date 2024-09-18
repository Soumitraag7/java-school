import java.util.*;
class array_simple
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[4];
        String b[]={"+","-","*","/","%"};
        int s=0;
        System.out.println("Enter four numbers : ");
        for(int i=0;i<4;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter any three mathematical operators[+,-,*,/,%] :");
        for(int j=0;j<3;j++)
        {
            b[j]=in.next();
        }
        s=a[0];
        for(int i=0;i<3;i++)
        {
            if (b[i].equals("+"))
            {
                s=s+a[i+1];
            }
            else
            
            if (b[i].equals("-"))
            {
                s=s-a[i+1];
            }
            else
            
            if (b[i].equals("*"))
            {
                s=s*a[i+1];
            }
            else
            
            if (b[i].equals("/"))
            {
                s=s/a[i+1];
            }
            else
            
            if (b[i].equals("%"))
            {
                s=s%a[i+1];
            }
        }
            System.out.println (s);        
    }
}
        