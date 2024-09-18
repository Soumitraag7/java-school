package bord_Q;


import java.util.Scanner;
class exchange
{
    String sent,rev;
    int size;
    exchange()
    {
        sent="";
        rev="";
        size=0;
    }
    void readsentence()
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a string");
        sent=in.nextLine();
    }
    void exfirstlast()
    {
        char cr;
        char temp=' ';
        char temp1=' ';
        int f=0,l=0;
        sent=" "+sent+" ";
        size=sent.length();
        //sent=sent.substring(0,size-1);
        for(int i=0;i<size;i++)
        {
            cr=sent.charAt(i);
            if (cr== ' ')
            {
                
                l=i-1;
                if(f!=0)
                {
                    temp=sent.charAt(f);
                    temp1=sent.charAt(l);
                    //System.out.println(temp+" "+temp1);
                    if(f!=l && f+1!=l)//1&2 chr
                    {
                        rev=rev+temp1+sent.substring(f+1,l)+temp+" ";
                        
                    }
                    else if (f+1==l)//2 chr
                    {
                        rev=rev+temp1+temp+" ";
                    }
                    else//1 chr
                    {
                        rev=rev+temp+" ";
                    }
                }
                f=i+1;
            }
            
        }
        
    }
    void display()
    {
        System.out.print("\nOriginal Sentence is: "+sent);
        System.out.print("\nNew Sentence is: "+rev);
    }
    public static void main(String [] args)
    {
        exchange ob=new exchange();
        ob.readsentence();
        ob.exfirstlast();
        ob.display();
    }
}