import java.util.*;
class Psquare
{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int s=in.nextInt();
        int e=in.nextInt();
        int count=0;
        for(int i=s;i<=e;i++)
        {
            for(int j=1;j*j<=i;j++)
            {
                if(j*j==i)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
