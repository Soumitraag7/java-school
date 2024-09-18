package Str;

// to convert all the first character of the String in upper case
import java.util.Scanner;
class convert
{
    public static void main(String [] args)
    {
        String st,st1="";
        int l;
        char cr,cr1;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a string");
        st=in.nextLine();
        st=" "+st;
        l=st.length();
        for(int i=0;i<l;i++)
        {
            cr=st.charAt(i);
            if (cr==' ')
            {
                cr1=st.charAt(i+1);
                st1=st1+' '+Character.toUpperCase(cr1);
                i+=1;
            }
            else
            {
                st1=st1+cr;
            }
        }
        System.out.println("\nThe new string");
        System.out.println(st1.trim());
    }
}