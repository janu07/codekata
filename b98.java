import java.util.*;
class b98
{
	
	public static void main(String[] args) 
	{
		int l,find=0;
        Scanner	sj = new Scanner(System.in);
        l=sj.nextInt();
        int arr[]= new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sj.nextInt();
        } 
        for(int k=0;k<l-1;k++)
        {
        
            if(arr[k]>arr[k+1])
            {
                find=k-1;
                k=l-1;
             }
        }
      
        System.out.print(arr[find]);
	}
}
