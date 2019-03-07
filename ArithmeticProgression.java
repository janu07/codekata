import java.util.*;
class ArithmeticProgression
{ 
	public static void main(String[] args) 
	{
		int a,d,n,sum=0;
        Scanner	sj= new Scanner(System.in);
        a=sj.nextInt();
        d=sj.nextInt();
        n=sj.nextInt();
        for(int i=0;i<n;i++)
        {   
                sum = sum + a; 
                a = a + d; 
        }
        
        System.out.print(sum);
       
	}
}
