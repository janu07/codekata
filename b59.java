import java.util.*;
class b59
{
     public static void main(String aa[])
{
    int n,r=0;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
	while(n > 0) 
{
			r = n % 10;
			r++;
			n = n / 10;
}
System.out.println(r);
		s.close(); 
}
}
