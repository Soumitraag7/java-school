package Str.cl12;


import java.util.Scanner;
class phone_no
{
    public static void main(String [] args)
    {
        String st;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a phone number with the area code");
        System.out.println("It should be in the formate ddd-ddddd ddddd\nWhere 'd' is the degit");
        st=in.nextLine();
        String area=st.substring(0,3);
        String phno=st.substring(4,9);
        String phno2=st.substring(10,15);
        System.out.println("The area code is: "+area);
        if (area.equals("091"))
        {
            System.out.println("The phone number is 0"+phno+"-"+phno2);
        }
        else
        {
            System.out.println("The phone number is (" +area+ ")"+phno+"-"+phno2);
        }
    }
}