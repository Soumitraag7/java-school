import java.util.*;
class primes
{
    public void twin(int m)
{
    int prime;
   for(int i=1;i<=m-2;i++)//for lim 17(m-2)
      {
          if(prime(i)==true && prime (i+2)==true)
          {
            System.out.println(i+","+(i+2)); 
          }
    }
}
public boolean prime(int n)
{
    int flag=0;
    for(int j=1;j<=n;j++)
    {
        if(n%j==0)
        {
            flag++;
        }
    }
    if(flag==2)
    {
        return(true);
    }
    else
    {
        return(false);
    }
}
public double brunoconstant(int x)
{
    int i;
    double sum=0.0;
    for(i=3;i<=(x-2);i++)
    {
       if(prime(i)==true && prime (i+2)==true) 
       sum=sum+(( 1.0/(double)i)+ (1.0/(double)(i+2)));
    }
    return(sum);
}
public static void main()
{
    int lim;
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE LIMIT");
    lim=in.nextInt();
    primes ob=new primes();
    ob.twin(lim);
    double k=ob.brunoconstant(lim);
    System.out.println("the brunoconstan="+k);
}
}  