import java.util.*;
import java.lang.*;
class b77
{
   public static void main(String args[])
   {
        Scanner sj = new Scanner(System.in);
        int n = sj.nextInt();
       for(int i=1;i<=n;i++)
       {
           if(n%i==0)
           {
               System.out.print(i);
               if(i<=n-1)
                 System.out.print(" ");
           }
       }
      sj.close();
   }
} 
