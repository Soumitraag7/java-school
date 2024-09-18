import java.util.*;
class point
{
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
        return(true);
    else
        return(false);
}
public boolean pal(int a)
{
    int i,j,rev=0,c=a;
    while(a>0)
    {
        j=a%10;
        rev=rev*10+j;
        a=a/10;
    }
    if(rev==c)
    return(true);
    else
    return(false);
}
public void Genpalprime(int p)
{
    int nm=1,i,pr,count=0;
   if(p==2)
   {
       System.out.println("the palprime number is="+11);
       count++;
   }
   else if(p==3)
   {
      int n1=101;
      for(i=2;i<=9;i++)
      {
          if(prime(i)==true)
          {
          nm=n1+i*10;
        
        if (prime(nm)==true && pal(nm)==true)
          {System.out.println("the number is="+nm);
        count++;
            }
    }
      }
      
    }
    else if(p==4)
   {
      int n1=1001;
      for(i=11;i<=99;i++)
      {
          if(prime(i)==true)
          {
          nm=n1+i*10;
        
        if (prime(nm)==true && pal(nm)==true)
        {
          System.out.println("the number is="+nm);
        count++;
        }
    }
      }
      
    }
    else if(p==5)
   {
      int n1=10001;
      for(i=101;i<=999;i++)
      {
          if(prime(i)==true)
          {
          nm=n1+i*10;
        
        if (prime(nm)==true && pal(nm)==true)
        {
          System.out.println("the number is="+nm);
          count++;
        }
    }
      }
      
    }
    else
    {
        if(p<2 || p>5)
        System.out.println("plz enter range between 2-5");
    }
    if(p>=2 && p<=5 && count==0)
    System.out.println("no palprime number in this range");
}
    public static void main()
    {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the range od palprime");
    int n=in.nextInt();
    point ob=new point();
    ob.Genpalprime(n);
}
}

   