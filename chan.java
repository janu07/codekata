 import java.util.*;
class chan
{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        String str1=in.next();
        String str2=in.next();
        int k=in.nextInt();
        int len1=str1.length();
        int len2=str2.length();
        int count=0;
        if(len1==len2)
        {
            for(int i=0;i<len1;i++)
            {
                if(str1.charAt(i)!=str2.charAt(i))
                {
                    count++;
                }
            } 
            if(k==count)
            {
                System.out.print("yes");
            }
            else
            {
                System.out.print("no");
            }
        }
    }
}
