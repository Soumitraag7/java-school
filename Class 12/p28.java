/*Binary Search:-

Enter number of elements:
4
Enter 4 integers
12
23
35
68
Enter the search value:
54
54 is not found.


Enter number of elements:
5
Enter 5 integers
32
38
45
59
68
Enter the search value:
45
45 found at location 3.


Enter number of elements:
5
Enter 5 integers
32
16
39
54
18
Enter the search value:
18
18 is not found.

Enter number of elements:
4
Enter 4 integers
56
52
31
12
Enter the search value:
31
31 is not found.*/

import java.util.Scanner;
class p28
{
   public static void main(String args[])
   {
      int counter, num, item, first, last, middle;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      num = in.nextInt();             
      int array[] = new int [num];
      System.out.println("Enter " + num + " integers");
      for (counter = 0; counter < num; counter++)
          array[counter] = in.nextInt();

      System.out.println("Enter the search value:");
      item = in.nextInt();
      first = 0;
      last = num - 1;
      middle = (first + last)/2;

      while( first <= last )
      {
         if ( array[middle] < item )
           first = middle + 1;
         else if ( array[middle] == item )
         {
           System.out.println(item + " found at location " + (middle + 1) + ".");
           break;
         }
         else
         {
             last = middle - 1;
         }
         middle = (first + last)/2;
      }
      if ( first > last )
          System.out.println(item + " is not found.\n");
   }
}

