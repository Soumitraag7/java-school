class p9
{
    public static void main (String args[])
    {
        int space=7,star=1;
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=star;k++)
            {
                System.out.print("*");
            }
            space--;
            star=star+2;
            System.out.println ();
        }
    }
}
                
            
            
    