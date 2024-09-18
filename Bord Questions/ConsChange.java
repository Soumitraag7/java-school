package bord_Q;

//Output:
/*

 */
import java.util.Scanner;
class ConsChange
{
    String word;
    int len;
    ConsChange()
    {
        
    }
    void readword()
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Entre a word");
        word=in.nextLine();
        word=word.toLowerCase();
        len=word.length();
    }
    void shiftcons()
    {
        String v="",c="";
        int i;
        char ch;
        for(i=0;i<len;i++)
        {
            ch=word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                v+=ch;
            }
            else
            {
                c+=ch;
            }
            
        }
        word=c+v;
        System.out.println("\nAfter taking all the vowels to last, the word is:\n"+word+"\n");
    }
    void changeword()
    {
        int i;
        char ch;
        String s="";
        for(i=0;i<len;i++)
        {
            ch=word.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
            {
                ch=(char)(ch-32);//Changing all the consonants to Capital letter
            }
            s=s+ch;
        }
        word=s;
        System.out.println("Changing all the consonants to Capital letter, the word is:\n"+word);
    }
    void show()
    {
        //System.out.println(word);
        shiftcons();
        changeword();
    }
    public static void main(String [] args)
    {
        ConsChange ob=new ConsChange();
        ob.readword();
        ob.show();
    }
}