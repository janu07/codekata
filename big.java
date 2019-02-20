import java.util.*;
class big
{
    public static void main(String[] args)
    {
        int s=0;
        int l=0; 
        int num;
        Scanner input=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
          num=input.nextInt();
          if(num>l)
          {
           l=num;
          }
        }  
          System.out.println(l);
 }
  
} 
