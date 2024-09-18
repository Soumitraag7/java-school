package Str.cl12;


import java.util.Scanner;
class Strings
{
    static String swapPairs(String st)
    {
        int l=st.length();
        int last=0;
        
        if (l%2==0)
        {
            last=l-1;
        }
        else
        {
            last=l-2;
        }
        
        StringBuffer sb=new StringBuffer(st);
        
        char ch1,ch2;
        
        for (int i=0;i<last;i+=2)
        {
            ch1=sb.charAt(i);
            ch2=sb.charAt(i+1);
            sb.setCharAt(i,ch2);
            sb.setCharAt(i+1,ch1);
        }
        return sb.toString();
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner (System.in);
        
        System.out.println("Enter a string");
        String s=in.nextLine();
        
        Strings subject=new Strings();
        
        String outstr=subject.swapPairs(s);
        
        System.out.println("Output String after swapping pairs of characters:");
        System.out.println(outstr);
    }
}