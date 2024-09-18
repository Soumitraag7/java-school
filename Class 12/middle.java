package Str.cl12;


import java.util.Scanner;
class middle
{
    String text;
    middle(String s)
    {
        text=s;
    }
    String extracText(String subs)
    {
        int start=text.indexOf(subs);
        start+=1;
        char cr=text.charAt(start);
        while(cr !=' ')
        {
            start+=1;
            cr=text.charAt(start);
        }
        int end=text.lastIndexOf(subs);
        return text.substring(start+1,end);
    }
    public static void main (String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String st=in.nextLine();
        
        middle ob=new middle(st);
        
        System.out.println("Enter the word that has multiple occurences in the text");
        String sub=in.nextLine();
        
        String ext=ob.extracText(sub);
        
        System.out.println("The text that lkies between two "+sub+"'s is:");
        System.out.println(ext);
    }
}