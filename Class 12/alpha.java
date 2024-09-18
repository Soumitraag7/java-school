package Str.cl12;


import java.util.Scanner;
class alpha
{
    String Str;
    alpha()
    {
        Str="";
    }
    void readword()
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a word in UPPERCASE letters:");
        Str=in.nextLine();
    }
    void arrange()
    {
        char [] arr=Str.toCharArray();
        int i,j;
        char newValue;
        
        for(i=0;i<arr.length;i++)
        {
            newValue=arr[i];
            j=i;
            while(j>0 && arr[j-1]>newValue)
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=newValue;
        }
        Str=new String(arr);
    }
    void display()
    {
        System.out.println("Word now is: "+Str);
    }
    public static void main()
    {
        alpha ob=new alpha();
        ob.readword();
        ob.arrange();
        ob.display();
    }
}