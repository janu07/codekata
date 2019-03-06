import java.util.*;
class b66
{
	public static void main(String args[])
	{
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		int f=0;
		for(int i=2;i<n;i++)
		{
		    if(n%i==0)
		        f=1;   
		}
        if(f==0)
         System.out.print("yes");  
        else
            System.out.print("no");
	}
}
