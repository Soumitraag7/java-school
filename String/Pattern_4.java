package Str;


import java.util.Scanner;
class Pattern_4
{
    public static void main(String [] args)
    {
        String st;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word to print the pattern");
        st=in.next();
        int b=st.length();
        
            for(int j=0;j<b;j++)
            {
                System.out.print(st.substring(j,b));
                
                System.out.print(st.substring(0,j));
                
                System.out.println();
            }
            
       
    }
}