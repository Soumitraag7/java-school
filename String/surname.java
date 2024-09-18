package Str;

import java.util.Scanner;
class surname
{
    public static void main(String[]args)
    {
        String st,sn,st1="",st2="";
        char cr;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter your full name");
        st=in.nextLine();
        st=" "+st;
        int l=st.length();
        int p=st.lastIndexOf(' ');
        sn=st.substring(p);
        for(int i=0;i<p;i++)
        {
            cr=st.charAt(i);
            if(cr==' ')
            {
                st1=st1+st.charAt(i+1)+'.';
            }
        }
        st2=st1+sn;
        System.out.print("Name as initial with surname "+st2);
    }
}