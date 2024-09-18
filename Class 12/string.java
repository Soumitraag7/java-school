package Str.cl12;


import java.util.Scanner;
class string
{
    static void print(String txt)
    {
        if(txt.length()>0)
        {
            System.out.print(txt.substring(0,1));  // seperating the first word
            for(int i=1;i<txt.length();i++)
            {
                System.out.print("-"+txt.substring(i,i+1));
            }
            System.out.println();                   // to end the line output
        }
    }
    public static void main (String [] args)
    {
        Scanner in=new Scanner (System.in);
        String st;
        System.out.println("Enter a string");
        st=in.nextLine();
        StringBuffer st1=new StringBuffer(st);
        st1=st1.reverse();
        print(st);
        print(st1.toString());
    }
}