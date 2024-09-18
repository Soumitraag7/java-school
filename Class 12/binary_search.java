import java.util.Scanner;
class binary_search
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
      //middle = (first + last)/2;

      while( true )
      {
          System.out.println("\nf>l");
         if(first > last)
         {
             System.out.println("Exit first.");
             System.out.println(item + " is not found.\n");
             break;
         }
          middle = (first + last)/2;
        
          System.out.println("Check condition of 1st if\n");
         if ( array[middle] < item )
         {
           first = middle + 1;
           System.out.println("Inside 1st if");
           System.out.println("Entering while after 1st if\n");
         }

         System.out.println("Check condition of 2nd if\n");
         if ( array[middle] > item)
         {
             last = middle - 1;
             System.out.println("Inside 2nd if");
             System.out.println("Entering while after 2st if\n");
         }

         System.out.println("Check condition of 3rd if\n");
         if ( array[middle] == item )
         {
           System.out.println(item + " found at location " + (middle + 1) + ".");
           System.out.println("Inside 3rd if");
           System.out.println("Entering while after 3st if\n");
           break;
         }
         //middle = (first + last)/2;
         System.out.println("Exit loop.");
      }

      System.out.println("Exit after while!");
      //if ( first > last )
          
   }
}

