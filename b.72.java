import java.util.*;
 
class b72
{
   public static void main(String args[])
   {
      String s;
      Scanner sj= new Scanner(System.in);
      s = sj.next().toLowerCase();
     
      int length = s.length(),c=0;
     
      for (int i = length - 1; i >= 0; i--)
      {
         char ch=s.charAt(i);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
         {
             c=1;
         }
      }  
      if (c==1)
      {
            System.out.println("yes");
      }
      else
      {
          System.out.println("no");
      } 
   }
   }
   
