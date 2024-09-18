package bord_Q;

//Output:
/*
 Enter a String
earth
Original string: earth
Total words: 1
Total Consonants: 4

 */
import java.util.Scanner;
class thestring
{
    int len, wordcount, cons;
    String str;
    thestring()
    {
        
    }
    thestring(String ds)
    {
        str=ds;
    }
    void countFreq()
    {
        wordcount=1;
        cons=1;
        len=str.length();
        char cr;
        for(int i=0;i<len;i++)
        {
            cr=str.charAt(i);
            if(cr==' ')
            {
                wordcount++;
            }
            else if(cr>=65 && cr<=90 || cr>=97 && cr<=122)
            {
                cr=Character.toLowerCase(cr);
            
                if(cr!='a' && cr!='e' && cr!='i' && cr!='o' && cr!='u')
                {
                    cons++;
                }
            }
        }
        
    }
    void Display()
    {
        System.out.println("Original string: "+str);
        System.out.println("Total words: "+wordcount);
         System.out.println("Total Consonants: "+cons);
    }
    public static void main(String [] args)
    {
        String str1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a String");
        str1=in.nextLine();
        thestring ob=new thestring(str1);
        ob.countFreq();
        ob.Display();
    }
}