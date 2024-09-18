package Str;


import java.util.Scanner;
class Pattern_3
{
    public static void main(String [] args)
    {
        String a;
        int k=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word to print the pattern");
        a=in.next();
        int b=a.length();
        for(int i=b;i>=0;i--)
        {
            for(int j=1;j<k;j++)
            {
                System.out.print(" ");
            }
            System.out.println(a.substring(0,i));
            k++;
        }
    }
}