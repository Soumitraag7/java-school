package Str;


import java.util.Scanner;
class replace
{
    public static void main(String [] args)
    {
        String st;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a string in lower case");
        st=in.nextLine();
        String rep=st.replace('e','*');
        System.out.println(rep);
    }
}