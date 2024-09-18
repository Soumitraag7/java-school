import java.util.*;
class function_unit
{
    public double cal (double a)
    {
         double cost=0.0;
        if(a<=100)
        {
            cost=a*(1.25);
        }
        else if(a>100 && a<=200)
        {
            cost=(125+(a-100))*1.50;
        }
        else
        {
            cost=(125+150+(a-200))*1.80;
        }
        //int r=(int)cost;
        return(cost);
    }
    public static void main(String args[])
    {
        int previous,present,number;
        double un=0.0,cn,pn;
        String name;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the consumer name");
        name=in.next();
        System.out.println("enter the consumber number");
        number=in.nextInt();
        System.out.println("enter the previous unit consumed");
        pn=in.nextInt();
        System.out.println("enter the present unit consumed");
        cn=in.nextInt();
        function_unit ob=new function_unit();
        un=cn-pn;
        double s=ob.cal(un);
        System.out.println("consumer no.\t Name\t Unit consumed\t Amount");
        System.out.print(number+    "\t"    +name+  "\t"+un+    "\t"+s);
    }
}

        
            
            
            