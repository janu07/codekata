import java.util.*;
import java.lang.*;
class play24
{
    public static void main(String ar[])
    {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        int len=s.length();
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                count++;
            }
        }
        if(count==len)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }    
    }
}
