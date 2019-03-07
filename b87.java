import java.lang.*;
import java.util.*;
 
 class b87
{
    public static void main(String args[])
    {
        int a,b,result=0;
        Scanner sj=new Scanner(System.in);
        a=sj.nextInt();
        b=sj.nextInt();
        
        int n=Math.min(a,b);
        for (int i=1;i<=n;i++)
        {
            if(a%i==0 && b%i==0)
            {
                result=i;
            }
        }
      
        System.out.println(result);
    }
}
