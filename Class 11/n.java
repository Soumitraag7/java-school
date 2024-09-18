import java.util.Scanner;
class n
{
    public static void main(String args[])
    {
        Scanner ne=new Scanner(System.in);
        int a,b,c,d,i,l,p;
        System.out.println("plz enter if you want to find the ");
        System.out.println("*************1.area of rectangle**********");
        System.out.println("************2.perimeter of rectangle*************");
        System.out.println("************3.dioganl of rectangle*********");
        a=ne.nextInt();
        switch(a)
        {
            case 1:System.out.println("enter the length of the rectangle");
            l=ne.nextInt();
            System.out.println("enter the breadth of the rectangle");
            b=ne.nextInt();
            c=l*b;
            System.out.println("area of rectangle= "+c);
            break;
            case 2:System.out.println("enter the length of the rectangle ");
            l=ne.nextInt();
            System.out.println("enter the brteath of the rectangle ");
            b=ne.nextInt();
            p=2*(l+b);
            System.out.println("perimeter of rectangle= "+p);
            break;
            case 3:System.out.println("enter the length of the rectangle ");
            l=ne.nextInt();
            System.out.println("enter the breadth of the rectanngle ");
            b=ne.nextInt();
            d=l+b;
            System.out.println("The diognal= "+d);
            break;
            default:System.out.println("error");
                }
            }
        }
            
        