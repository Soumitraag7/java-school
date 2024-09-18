package bord_Q;


import java.util.Scanner;
class Vowel_Word
{
    String str;
    int freq;
    Vowel_Word()
    {
        str="";
        freq=0;
    }
    void readStr()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        str=in.nextLine();
    }
    void freq_vowel()
    {
        String w;
        char cr;
        int l=str.length();
        str=" "+str;
        char cr1;
        for(int i=0;i<l;i++)
        {
            cr=str.charAt(i);
            if(cr==' ')
            {
            cr1=str.charAt(i+1);
            if(cr1=='a' || cr1=='e' || cr1=='i'|| cr1=='o'|| cr1=='u')
            {
                freq++;
            }
            if(cr1=='A' || cr1=='E' || cr1=='I'|| cr1=='O'|| cr1=='U')
            freq++;
            }
        }
    }
    void display()
    {
        System.out.println("Original String: "+str.trim());
        System.out.println("Frequency of word begining with vowel are: "+freq);
    }
    public static void main(String [] args)
    {
        Vowel_Word ob=new Vowel_Word();
        ob.readStr();
        ob.freq_vowel();
        ob.display();
    }
}