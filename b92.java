import java.util.*;
class b92
{
	
	public static void main(String[] args) 
	{
		int l,sum=0;
        Scanner	sj = new Scanner(System.in);
        l=sj.nextInt();
        int arr[]= new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sj.nextInt();
            sum+=arr[i];
        }
        System.out.print(sum);
       
	}
}
