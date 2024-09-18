package Str;


import java.util.Scanner;
class full_name
{
    public static void main(String [] args)
    {
        String st;
        int l;
        int c=0;
        char cr;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a string");
        st=in.nextLine();
        StringBuffer a=new StringBuffer(st);
        l=a.length();
        for (int i=0;i<l;i++)
        {
            cr=a.charAt(i);
            if (cr==' ')
            {
                break;
            }
            else
            {
                c+=1;
            }
        }
        System.out.println("The full name :"+a.insert(c," Kr."));
    }
}