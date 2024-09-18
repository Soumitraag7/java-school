package Str;


import java.util.Scanner;
class convert_case
{
    public static void main(String [] args)
    {
        String st,st1=" ";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sting to change is case");
        st=in.nextLine();
        int l=st.length();
        char chr,chr1;
        for(int i=0;i<l;i++)
        {
            chr=st.charAt(i);
            if (chr>='a' && chr<='z')
            {
                chr1=Character.toUpperCase(chr);
                st1=st1+chr1;
            }
            else if (chr>='A' && chr<='Z')
            {
                chr1=Character.toLowerCase(chr);
                st1=st1+chr1;
            }
            else
            {
                st1+=chr;
            }
        }
        System.out.println("The new string after converting the case of each alphabet:"+st1);
    }
}