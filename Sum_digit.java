import java.util.*;
class Sum_digit
{
     public static void main(String aa[])
{
    int n,Sum=0,r;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
	while(n > 0) 
{
			r = n % 10;
			Sum = Sum+r;
			n = n / 10;
}
System.out.println(Sum);
		s.close(); 
}
}
