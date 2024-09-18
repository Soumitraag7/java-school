import java.util.Scanner;
class factor_while
{
    public static void main(String[]args)
    {
        int a,n,i=1;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER n=");
        a=in.nextInt();
        System.out.println("FACTOR OF: "+a);
        while(i<=a)
        {
            if(a%i==0)
            {
               System.out.println(i);
            }
            i++;
        }
    }
}
/*
  do
  {
      if(a%i==0)
      {
          Syatem.out.println(i);
      }
        i++;
  }
    while(i<=a);
 */