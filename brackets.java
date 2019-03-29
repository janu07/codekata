import java.util.*;
class brackets
{
    public static void main(String arg[])
    {
        Scanner sj=new Scanner(System.in);
        String str=sj.next();
        int len=str.length();
        int count1=0,count2=0;
            for(int i=0;i<len;i++)
            {
                if(str.charAt(i)==')')
                {
                    count1++;
                }
                else if(str.charAt(i)=='(')
                {
                    count2++;
                }
            } 
            if(count1==count2)
            {
                System.out.print("yes");
            }
            else
            {
                System.out.print("no");
            }
        
    }
}
