import java.util.Scanner;
class arr_index
{
public static void main(String [] args)
{
Scanner sj=new Scanner(System.in);
int n=sj.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sj. nextInt();
}
for(int i=0;i<n;i++)
{
	System.out.println("\n"+a[i]+" "+i);
}
}
}
