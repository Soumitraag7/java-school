class p11
{
    public static void main (String args[])
    {
        int space=10,star=1;
        for (int i=1;i<=5;i++)
        {
            int t=i;
            for (int j=1;j<=space+2;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=star;k++)
            {
                System.out.print(t);
                t++;
            }
            space--;
            star=star+2;
            System.out.println ();
        }
    }
}
                
            
            
    