import java.util.*;
 
class b73
{
   public static void main(String args[])
   {
      int num,start,end;
      Scanner sj= new Scanner(System.in);
      num = sj.nextInt();
      start   = sj.nextInt();
      end = sj.nextInt();
     
      int c=0;
     
      for (int i=start+1;i<end;i++)
      {
         
         if(i==num)
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
