import java.util.*;
public class cal {
   public static void main( String [] args) {
            
       System.out.println("welcome");
       Scanner sc = new Scanner;
       int x = sc.nextInt();
       int y = sc.nextInt();

       int add = addition(x,y);

   }

   public int addition(int x , int y) 
   { 
      return x+y;
   }
   
   
}
