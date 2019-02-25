import java.util.Scanner;
class count_digits
{
	public static void main(String[] args)
	{
	    int c=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n!=0)
		{
            n=n/10;
            c++;
		}
		        System.out.println(c);
		        
	}
}
