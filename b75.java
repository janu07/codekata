import java.util.*;
import java.lang.*;
class b75
{
   public static void main(String args[])
   {
        String s;
        Scanner sj = new Scanner(System.in);
        s= sj.next();
        int len=s.length();
        char charArray[]=s.toCharArray();  
        if(len%2!=0)
        {
        int mid=len/2;
        charArray[mid]='*';
        }
        else
        {
        int mid=len/2;
        charArray[mid-1]='*';
        charArray[mid]='*';

        }
        for(int i=0;i<len;i++)
        {            
             System.out.print(charArray[i]);
        }
        
   }
} 
