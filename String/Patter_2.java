package Str;


import java.util.Scanner;
class Patter_2
{
    public static void main(String [] args)
    {
        String a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word to print the pattern");
        a=in.next();
        int b=a.length();
        for(int i=0;i<=b;i++)
        {
            System.out.println(a.substring(0,i));
        }
    }
}