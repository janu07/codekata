import java.util.*;
class big
{
    public static void main(String[] args)
    {
        int s=0;
        int l=0; 
        int num;
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++)
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
