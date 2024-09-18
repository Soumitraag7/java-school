import java.util.Scanner;
class function_sides
{
    public void decide(int x,int y,int z)
    {
        int n;
        if(x+y>z && x+z>y && y+z>x)
        {
            if(x==y && x==z)
            {
                System.out.println("it is an equilateral triangle");
            }
            else if( z==y || x==z ||y==x)
            {
                System.out.println("it is an isosceles triangle");
            }
            else
            {
                System.out.println("it is an scalene triangle");
            }
        }
        else
        {
            System.out.println("it is not a triangle");
        }
    }
    public static void main()
    {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        function_sides ob=new function_sides();
        System.out.println("enter the sides");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        ob.decide(a,b,c);
    }
}
        
  
        
        
        
            
        
            
        