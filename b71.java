import java.util.*;
 
class b71
{
   public static void main(String args[])
   {
      String org, r = "";
      Scanner sj = new Scanner(System.in);
     
    org = sj.next();
     
      int length = org.length();
     
      for (int i = length - 1; i >= 0; i--)
      {
         r += org.charAt(i);
      }  
      if (org.equals(r))
      {
            System.out.println("yes");
      }
      else
      {
          System.out.println("no");
      } 
   }
} 
