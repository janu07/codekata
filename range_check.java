import java.util.Scanner;
class range_check
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n)
		{
		    case 0:
		    case 1: 
		    case 2:
		    case 3:
		    case 4:
		    case 5:
		    case 6:
		    case 7:
		    case 8:
		    case 9:
		    case 10:
		        System.out.println("yes");
		        break;
		    default:
		        System.out.println("No");
		        
		}
		
	}
}
