package Str;


import java.util.*;
class count
{
    public static void main(String[]args)
    {
        String st;
        boolean b;
        int a=0,c=0,z=0;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a string");
        st=in.nextLine();
        int l=st.length();
        
        for(int i=0;i<l;i++)
        {
            char cr=st.charAt(i);
            b=Character.isWhitespace(cr);
            if(b==true)
            a++;
            else if( Character.isLetter(cr) )
            c++;
        }
        String cr1=st.trim();
        int l1=cr1.length();
        for(int i=0;i<l1;i++)
        {
            char cr3=cr1.charAt(i);
            b=Character.isWhitespace(cr3);
            if(b==true)
            z++;
        }
        System.out.println("The total number of blank space= "+(a));
        System.out.println("The total number of words are: "+(z+1));
        System.out.println("The number of character present in the string= "+c);
    }
}