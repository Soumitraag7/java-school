import java.util.*;
class function_twin_prime
{
    public int twin(int m)
{
    int flag=0;
   for(int j=1;j<=m;j++)
      {
          if(m%j==0)
          {
              flag++;
          }
    }
    if(flag==2)
    {
        return(1);
    }
    else
    {
        return(0);
    }
}
    public static void main(String args[])
    {
    int i,j;
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER A NUMBER");
    i=in.nextInt();
    j=in.nextInt();
    function_twin_prime ob=new function_twin_prime();
    int p=ob.twin(i);
    int d=ob.twin(j);
    if((p==1 && d==1)&& (i-j==2||j-i==2))
    {
        System.out.println("it is a twin prime number");
    }
    else
    {
        System.out.println("it is not a twin prime number");
    }
}
}
