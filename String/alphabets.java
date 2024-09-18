package Str;


import java.util.Scanner;
class alphabets
{
    public static void main(String [] args)
    {
        String st;
        char ch;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a string");
        st=in.nextLine();
        int l=st.length();
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<=l;j++)
            {
                ch=st.charAt(j);
                if( ch==(char)i || ch==(char)(i+32) )
                System.out.println(ch);
            }
        }
    }
}