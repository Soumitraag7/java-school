package buffer_string;
import java.util.*;
class password
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstname=in.nextLine();
        System.out.println("Enter the middle name");
        String middlename=in.nextLine();
        System.out.println("Enter the last name");
        String lastname=in.nextLine();
        System.out.println("Enter the age");
        int age=in.nextInt();
        int a=0,b=0,c=0;
        a=firstname.length();
        b=middlename.length();
        c=lastname.length();
        String a1=firstname.substring(0,1)+firstname.substring(a-1,a);
        String b1=middlename.substring(0,1)+middlename.substring(b-1,b);
        String c1=lastname.substring(0,1)+lastname.substring(c-1,c);
        String password=c1+(age/10)+a1+(age%10)+b1;
        System.out.println("ur password="+password);
    }
}
        