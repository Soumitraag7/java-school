//bineary search & it's position
import java.util.*;
class array_search3
{
  public static void main (String args[])
  {
        Scanner in = new Scanner (System.in);
        int a,mid=0,k=0,ll=0,ul=5;
        int A[]={1,2,3,4,5,6};
        System.out.println("Enter the value to searched :");
        a=in.nextInt();
        while (ul>=ll)
        {
        mid=(ul+ll)/2;
        if (A[mid]<a)
        
            ll=mid+1;
        
        else 
        if (A[mid]>a)
        
            ul=mid-1;
        
        else 
        if (A[mid]==a)
        {
            k=1;
            break;
        }
    }
    if (k==1)
    {
        System.out.println ("Found");
    }
    else
    {
        System.out.println ("Not Found");
    }
  }
}