import java.util.*;
class b59
{
     public static void main(String aa[])
{
    int n,c=0,r;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
	while(n > 0) 
{
			r = n % 10;
			if(r!=0)
			    c++;
			n = n / 10;
}
System.out.println(c);
		s.close(); 
}
}
