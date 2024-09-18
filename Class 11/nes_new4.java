/*n=5
           
    *    
   ***   
  *****  
 ******* 
 ******* 
  *****  
   ***   
    *    
         
 
*/

import java.util.Scanner;
class nes_new4
{
    public static void main(String[]args)
    {
        int n;
        int i,j,k,l;
        int i1,j1,l1;
        Scanner a=new Scanner (System.in);
        System.out.println("N=");
        n=a.nextInt();
        l=n;
        for (i=n;i>=1;i--)
        {
            for(j=1;j<=n*2-1;j++)
            {
                if(i>=j||l<=j)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            l++;
            System.out.println("");
        }
        l1=n*2-1;
        for (i1=1;i1<=n;i1++)
        {
            for(j1=1;j1<=n*2-1;j1++)
            {
                if(i1>=j1||l1<=j1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            l1--;
            System.out.println("");
        }
    }
}