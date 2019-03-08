import java.util.*;
import java.lang.*;
 class p3
{
    public static void main(String args[])
    {   int rev=0;
        Scanner sj=new Scanner(System.in);
        int n=sj.nextInt();
        while(n!=0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        System.out.println(rev);
    }
}
