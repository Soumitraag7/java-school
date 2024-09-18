package Str;


import java.util.Scanner;
class piglatin
{
    public static void main(String [] args)
    {
        String st;
        char c;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a string");
        st=in.nextLine();
        int l=st.length();
        for(int i=0;i<l;i++)
        {
            c=st.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            {
                break;
            }
        }
    }
}