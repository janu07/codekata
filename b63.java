import java.util.*;
class b63
{
	public static void main(String args[])
	{
		Scanner sj=new Scanner(System.in);
		int[] n=new int[10];
		int min=100000;
        for(int i=0;i<10;i++)
        {
           n[i]=sj.nextInt();
           if(n[i]<=min)
            min=n[i];
        }
        
            System.out.print(min);
       
    }
}
