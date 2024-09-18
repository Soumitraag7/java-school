package Str;


import java.util.*;
class first_and_last
{
    public static void main(String [] args)
    {
        String st,st1="";
        char c;
        char cr,f,l1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        st=in.nextLine();
        System.out.println("Enter your choise\nIf you want the first word enter'F' or if you want the last word then enter 'L'");
        c=in.next().charAt(0);
        switch(c)
        {
            case 'F':
            st=" "+st;
            int l=st.length();
            System.out.println("The first character are");
            for(int i=0;i<l;i++)
            {
                cr=st.charAt(i);
                if(cr==' ')
                {
                   System.out.println(st.charAt(i+1));
                }
            }
            break;
            case 'L':
            st=st+" ";
            l=st.length();
            System.out.println("The last character are");
            for(int i=0;i<l;i++)
            {
                cr=st.charAt(i);
                if(cr==' ')
                {
                    System.out.println(st.charAt(i-1));
                }
            }
            break;
            default:
            System.out.println("Wrong input");
        }
    }
}