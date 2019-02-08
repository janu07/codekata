import java.util.Scanner;
class odd
{
public static void main(String []agrs)

{
	int i;
	Scanner ip=new Scanner(System.in);
    int a=ip.nextInt();
    int b=ip.nextInt();
    if(b<100000)
    {
        for(i=a;i<=b;i++)
        {
            if(i%2==1)
             System.out.println(i);
        }
    }

}
}
