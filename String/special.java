package Str;
import java.util.Scanner;
class special
{
    public static void main(String [] args)
    {
        String st;
        char cr;
        int uc=0,lc=0,di=0,sc=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        st=in.nextLine();
        int l=st.length();
        for(int i=0;i<l;i++)
        {
            cr=st.charAt(i);
            if (Character.isUpperCase(cr) == true)
            {
                uc+=1;
            }
            else if(Character.isLowerCase(cr) == true)
            {
                lc+=1;
            }
            else if(Character.isDigit(cr) == true)
            {
                di+=1;
            }
            else
            {
                sc+=1;
            }
            
        }
            System.out.println("The number of lower case Character= "+lc);
            System.out.println("The number of upper case Character= "+uc);
            System.out.println("The number of special Character in the string= "+sc);
            System.out.println("The number of digits= "+di);
    }
}