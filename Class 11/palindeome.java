 

import java.util.Scanner;
class palindeome
{
    public static void main(String [] args)
    {
        String st;
        String st1="";
        char cr;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a nu");
        st=in.nextLine();
        int l=st.length();
        for(int i=l-1;i>=0;i--)
        {
            cr=st.charAt(i);
            st1=st1+cr;
        }
        if (st.equals(st1))
        {
            System.out.println("Palindeome");
        }
        else 
        {
            System.out.println("Not Palindeome");
        }
    }
}