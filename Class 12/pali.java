/*palimbrom number
 * 
 * output:
 * 
Enter a no
121
Its a palibrom no

 * 
 */

import java.util.Scanner;
class pali
{
    public static void palim (int a)
    {
        int rev=0,b;
        int c=a;
        while (a>0)
        {
          b=a%10;
          rev=rev*10+b;
          a=a/10;
        }
        if(c==rev)
        {
            System.out.println("Its a palibrom no");
        }
        else
        {
           System.out.println("Its not a palibrom no");
        }
    }
    public static void main()
    {
        int z;
        Scanner in=new Scanner(System.in);
        //pali ob=new pali();
        System.out.println("Enter a no");
        z=in.nextInt();
        palim(z);
    }
}