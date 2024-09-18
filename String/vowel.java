package Str;


import java.util.Scanner;
class vowel
{
    public static void main(String[]args)
    {
        int a=0;
        String st;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a string to find the no of vowels");
        st=in.nextLine();
        int l=st.length();
        for(int i=0;i<l;i++)
        {
            if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u'||st.charAt(i)=='A'||st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U')
            {
               a++; 
            }
        }
        System.out.print("The no of vowels in the string: "+a);
    }
}