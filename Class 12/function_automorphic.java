import java.util.Scanner;
class function_automorphic
{
    public int digit(int n)
    {
        int i,c=0,p;double k=0.0D;
        i=n*n;
        while(n!=0)
        {
        n=n/10;
        c=c+1;
    }
    k=i%(Math.pow(10,c));
    int r=(int)k;
    return(r);
}
public static void main()
  {
    int  a;
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER A NUMBER");
    a=in.nextInt();
    function_automorphic ob=new function_automorphic();
    int s=ob.digit(a);
    if(a==s)
      {
         System.out.println("it is a automorphic number");
      }
    else
      {
         System.out.println("it is not a automorphic number");
      }
    }
}