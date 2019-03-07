import java.util.*;
class b85
{ 
  
    public static void main(String[] args) 
    { 
        Scanner sj=new Scanner(System.in);
        String c =sj.next(); 
        char ch[] = c.toCharArray(); 
        for(int i=0;i<ch.length;i++)
        {
        System.out.print(ch[i]);
        i++;
        } 
        System.out.print(" ");
        for(int i=1;i<ch.length;i++)
        {
        System.out.print(ch[i]);
        i++;
        }  
    } 
} 
