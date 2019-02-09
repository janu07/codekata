import java.util.Scanner;
class fact
{
  public static void main(String []args)
  {
	  Scanner ip=new Scanner(System.in);
    int sum=1,i;
	  int n=ip.nextInt();
    for(i=1;i<=n;i++)
    {
        sum=sum*i;
    }
    System.out.println(sum);
  }
}
