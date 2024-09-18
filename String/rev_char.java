package Str;
import java.util.Scanner;
class rev_char
{
    public static void main(String [] args)
    {
        String st,st1="",st2="";
        char cr;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        st=in.nextLine();
        st+=" ";
        int l=st.length();
        for (int i=0;i<l;i++)
        {
            cr=st.charAt(i);
            if (cr==' ')
            {
                st2=st2+" "+st1;
                st1=" ";
            }
            else
            {
                st1=cr+st1;
            }
        }
        System.out.println("The reverse of each charecter of the new word is\n"+st2);
    }
}