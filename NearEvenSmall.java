import java.util.*;
class NearEvenSmall
{
     public static void main(String aa[])
{
    int n;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
	if(n%2==0) 
{
	System.out.println(n);			
}
	else 
{
	System.out.println(n-1);	
}

		s.close(); 
}
}
